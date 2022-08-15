<!-- 小技巧：讓 jsp 可以支援所有 HTTP 方法 -->
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
		href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
	<meta charset="UTF-8">
	<title>Employee Form</title>
	<style type="text/css">
		.error {
			color: #FF0000;
		}
	</style>
	
</head>
<body style="padding: 15px;">

	<table>
		<tr>
			<!-- Employee Form -->
			<td valign="top">
				Employee Form
			</td>
			<!-- Salary Column Chart -->
			<td valign="top">
				Salary Column Chart
			</td>
			<!-- Salary Pie Chart -->
			<td valign="top">
				Salary Pie Chart
			</td>
			<!-- Jobs Line Chart -->
			<td valign="top">
				Jobs Line Chart
			</td>
		</tr>
		<tr>
			<!-- Employee List -->
			<td valign="top" colspan="4">
				Employee List
			</td>
		</tr>
	</table>
</body>
</html>