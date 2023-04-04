<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>comment</title>
</head>
<body>
<%-- new comment  --%>
	<div style="margin: 10px;">
		<div style="display: flex; align-items: baseline;">
			<h3 style="flex: 1"> comment </h3>
			<div>
				<small> <b style="color: gray">${moim.managerName }</b></small>
			</div>
		</div>
		
		<div
			style="padding: 10px; border: 1px solid #777; margin-bottom: 4px; border-radius: 4px;">
			<div>
				
			</div>
				
			<div style="display: flex; gap: 10px; justify-content: center">
			
				<div style="border-radius: 20px; max-width: 100%; max-height: 30vh" >
				</div>
				</div>
			<div style="text-align: right; font-size: small; color: red;">
				<a href="/home/plus.jsp"> ★ </a>
			</div>
			
			<div style="text-align: right; font-size: small;">
				<a href="/home/fix.jsp">수정</a> | <a href="/home/idx.jsp">삭제</a>
			</div>
		
		</div>
	
	</div>
</body>
</html>