<%@ page import="java.util.*,productmanagement.Product" %>

<html>
<head>
<style>
body {
    font-family: Arial;
    background: #f0f0f0;
}

.container {
    width: 90%;
    margin: auto;
    margin-top: 30px;
}

table {
    width: 100%;
    border-collapse: collapse;
    background: white;
}

th {
    background: #3b8dbc;
    color: white;
    padding: 12px;
}

td {
    padding: 12px;
    text-align: center;
    border-bottom: 1px solid #ddd;
}

tr:hover {
    background: #f5f5f5;
}

.delete-btn {
    background: #e74c3c;
    color: white;
    padding: 6px 12px;
    border-radius: 6px;
    text-decoration: none;
}

.delete-btn:hover {
    background: #c0392b;
}

.back {
    display: block;
    width: 80px;
    margin: 20px auto;
    padding: 10px;
    background: #2c3e50;
    color: white;
    text-align: center;
    border-radius: 5px;
    text-decoration: none;
}
</style>
</head>

<body>

<div class="container">
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Category</th>
<th>Price</th>
<th>Quantity</th>
<th>Action</th>
</tr>

<%
List<Product> list = (List<Product>)request.getAttribute("data");
for(Product p : list){
%>
<tr>
<td><%=p.id%></td>
<td><%=p.name%></td>
<td><%=p.category%></td>
<td><%=p.price%></td>
<td><%=p.qty%></td>
<td>
<a class="delete-btn" href="delete?id=<%=p.id%>">Delete</a>
</td>
</tr>
<% } %>

</table>

<a href="index.jsp" class="back">Back</a>

</div>
</body>
</html>