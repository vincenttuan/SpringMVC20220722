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
	<title>Job Form</title>
	<style type="text/css">
		.error {
			color: #FF0000;
		}
	</style>
</head>
<body style="padding: 15px;">
	<table >
		<tr>
			<!-- Job Form -->
			<td valign="top">
				Job Form
			</td>
			<!-- Job List -->
			<td valign="top" colspan="2">
				<form class="pure-form">
					<fieldset>
						<legend>Job List</legend>
					</fieldset>
					<table class="pure-table puretable-bordered">
						<thead>
							<tr>
								<th rowspan="2" valign="middle" align="center">編號</th>
								<th rowspan="2" valign="middle" align="center">名稱</th>
								<th colspan="2" align="center">員工資料</th>
							</tr>
							<tr style="border-top: 1px solid lightgray;">
								<th>員編</th>
								<th>姓名</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="job" items="${ jobs }">
								<tr>
									<td>${ job.jid }</td>
									<td>${ job.jname }</td>
									<td>${ job.employee.eid }</td>
									<td>
										<a href="${ pageContext.request.contextPath }/mvc/jdbc/employee/${ job.employee.eid }" title="按我一下可以修改員工資料">
											${ job.employee.ename }
										</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form>
			</td>
			<!-- Job Bar Chart -->
			<td valign="top">
				Job Bar Chart
			</td>
		</tr>
	</table>
</body>
</html>