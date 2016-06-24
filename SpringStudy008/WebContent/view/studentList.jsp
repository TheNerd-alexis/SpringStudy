<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringStudy008 - studentList</title>
</head>
<body>
	<center>
		<table>
			<c:forEach items="${studentList }" var="student">
				<tr>
					<td>${student.id }</td>
					<td>${student.name }</td>
					<td>${student.grade }</td>
					<td><input type="button" value="수정"
						onclick="location.href='modifyStudentForm.do?id=${student.id}'"></td>
					<td><input type="button" value="삭제"
						onclick="location.href='deleteStudent.do?id=${student.id}'"></td>
				</tr>
			</c:forEach>
		</table>

		<input type="button" value="학생 정보 추가"
			onclick="location.href='addStudentForm.do'">
	</center>

</body>
</html>