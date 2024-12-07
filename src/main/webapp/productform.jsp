<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
    <h1>Product Form</h1>
    <form method="get">
        <label>Product ID:</label><input type="text" name="productId"><br>
        <label>Product Name:</label><input type="text" name="productName"><br>
        <label>Price:</label><input type="text" name="price"><br>
        <label>Description:</label><textarea name="description"></textarea><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
