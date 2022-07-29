<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
<meta charset="UTF-8">
<title>Lotto</title>
</head>
<body style="padding: 15px">
	<button type="button"
		onclick="window.location.href='/spring.mvc/mvc/lotto/get';"
		class="pure-button pure-button-primary">
		Lotto 539 電腦選號
	</button>
	<p />
	最新電腦選號: ${ lotto }
	<p />
	歷史紀錄
	<table class="pure-table pure-table-bordered">
		<thead>
			<tr>
				<th>#</th>
				<th>Lotto</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach varStatus="status" var="lotto" items="${ lottos }">
				<tr>
					<td>${ status.index }</td>
					<td>${ lotto }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>