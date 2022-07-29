<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	${ lottos }
</body>
</html>