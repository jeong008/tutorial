package controller.moim;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Attendance;
import data.Moim;
import data.User;
import repository.Attendances;
import repository.Moims;
import repository.Users;

@WebServlet("/moim/detail")
public class MoimDetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Moim moim = Moims.findById(id);
		if(moim == null) {
			resp.sendRedirect("/moim/search");
			return;
		}
		User manager = 	Users.findById(moim.getManagerId());
		List<Attendance> attendances = Attendances.findByMoimId(id);
		for(Attendance a : attendances) {
			User found = Users.findById(a.getUserId());
			a.setUserAvatarURL(found.getAvatarURL());
			a.setUserName(found.getName());
		}
		req.setAttribute("attedances", attendances);
		
		User logonUser = (User)req.getSession().getAttribute("logonUser");
		if(logonUser == null) {
			req.setAttribute("status", -1);
		}else {
			//===================
//			Attendance found = Attendances.findByMoimIdAndUserId(id,logonUser.getId());
//			if(found == null) {
//				req.setAttribute("status",0);
//			} else {
//				req.setAttribute("status",  found.getStatus());
//			}
			
			req.setAttribute("status", 0);
		}
		
		
		
		
		System.out.println(moim);
		System.out.println(manager);
		System.out.println(attendances);
		req.setAttribute("moim", moim);
		req.setAttribute("manager", manager);
		req.setAttribute("attendances", attendances);
		
		// 뷰로 넘기는 작업은 패스
	}
}