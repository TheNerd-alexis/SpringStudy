<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringStudy008 - modifyStudentForm</title>
</head>
<body>
	<center>
		<table>
			<form action="modifyStudent.do">

				<input type="hidden" value="${student.id }" name="id">
				<tr>
					<td>아이디 :</td>
					<td>${student.id }</td>
				</tr>
				<tr>
					<td>이름 :</td>
					<td><input type="text" value="${student.name}" name="name">
					</td>
				</tr>
				<tr>
					<td>학년 :</td>
					<td><input type="text" value="${student.grade }" name="grade"></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" value="학생 정보 수정"></td>
				</tr>
			</form>
		</table>
	</center>
</body>
</html>