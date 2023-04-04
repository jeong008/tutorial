package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import data.User;

public class Replys {
	static final String url = "jdbc:oracle:thin:@192.168.4.22:1521:xe";
	static final String user = "C##MOIM";
	static final String password = "1q2w3e4r";

	// 1. 데이터 등록하기
	public static int create(String id, String moim_id, String writer, String ment, Date writed) {
		try {
			// 1. 연결
			Connection conn = DriverManager.getConnection(url, user, password);

			// 2. 요청객체 준비
			String sql = "INSERT INTO REPLYS(ID, MOIM_ID, WRITER, MENT, WRITED) VALUES(?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, moim_id);
			ps.setString(3, writer);
			ps.setString(4, ment);
			ps.setDate(5, writed);

			int r = ps.executeUpdate();
			conn.close();

			return r;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}


}
