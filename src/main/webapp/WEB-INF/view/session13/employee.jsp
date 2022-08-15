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

	<table style="width: 100%">
		<tr>
			<!-- Employee Form -->
			<td valign="top">
				<spform:form class="pure-form"
					method="post"
					modelAttribute="employee"
					action="${ pageContext.request.contextPath }/mvc/jdbc/employee/">
					<fieldset>
						<legend>Employee Form</legend>
						<input type="hidden" id="_method" name="_method" value="${ _method }" />
						編號: <spform:input path="eid" readonly="true" /><p />
						姓名: <spform:input path="ename" /><br />
							 <spform:errors path="ename" cssClass="error" /><p />
						薪資: <spform:input path="salary" /><br />
							 <spform:errors path="salary" cssClass="error" /><p />
						<button type="submit" ${ _method eq 'POST'?'':'disabled' } class="pure-button pure-button-primary">
							新增
						</button>
						<button type="submit" ${ _method eq 'PUT'?'':'disabled' } class="pure-button pure-button-primary">
							修改
						</button>
						<p />
						<spform:errors path="*" cssClass="error" />
					</fieldset>
				</spform:form>
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
				<form class="pure-form">
					<fieldset>
						<legend>
							Employee List
						</legend>
						<table class="pure-table pure-table-bordered" style="width: 100%">
							<thead>
								<tr>
									<th>編號</th><th>姓名</th><th>薪資</th><th>工作</th><th>建立時間</th>
								<tr>
							</thead>
							<tbody>
								<c:forEach var="emp" items="${ employees }">
									<tr>
										<td>
											<a href="./${ emp.eid }" title="按我一下可以修改">
												${ emp.eid }
											</a>
										</td>
										<td>${ emp.ename }</td>
										<td>${ emp.salary }</td>
										<td>
											<c:forEach var="job" items="${ emp.jobs }">
												${ job.jname }
											</c:forEach>
										</td>
										<td>${ emp.createtime }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</fieldset>
				</form>
				
			</td>
		</tr>
	</table>
</body>
</html>