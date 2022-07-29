<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
	<meta charset="UTF-8">
	<title>Lotto</title>
	<style type="text/css">
		td, th {
			text-align: center;
		}
	</style>
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
				<th>號碼 1</th>
				<th>號碼 2</th>
				<th>號碼 3</th>
				<th>號碼 4</th>
				<th>號碼 5</th>
				<th>更新 (Update)</th>
				<th>刪除 (Delete)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach varStatus="status" var="lotto" items="${ lottos }">
				<tr>
					<td>${ status.index }</td>
					<c:forEach var="num" items="${ lotto }">
						<td>${ num }</td>
					</c:forEach>
					<td>
						<button type="button"
							onclick="window.location.href='/spring.mvc/mvc/lotto/update/${ status.index }';"
							class="pure-button pure-button-primary">
							更新
						</button>
					</td>
					<td>
						<button type="button"
							onclick="window.location.href='/spring.mvc/mvc/lotto/delete/${ status.index }';"
							class="pure-button pure-button-primary">
							刪除
						</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>