<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
		<meta charset="UTF-8">
		<title>Product</title>
	</head>
	<body style="padding: 15px">
		<form class="pure-form" method="post" action="/spring.mvc/mvc/product/">
			<fieldset>
				<legend>Product 表單</legend>
				<input type="text" placeholder="請輸入商品名稱" id="productName" name="productName"><p />
				<input type="number" placeholder="請輸入商品數量" id="quantity" name="quantity"><p />
				<input type="number" placeholder="請輸入商品價格" id="price" name="price"><p />
				<button type="submit" class="pure-button pure-button-primary">Add</button>
			</fieldset>
		</form>
		
		<form class="pure-form">
			<fieldset>
				<legend>Product 列表</legend>
				
			</fieldset>
		</form>
		
		
	</body>
</html>