<form action="report" method="post">
Enter Price: <input name="price">
<input type="submit" value="Get Report">
</form>

<%@ page import="java.util.*,productmanagement.Product" %>

<%
List<Product> list = (List<Product>)request.getAttribute("data");
if(list!=null){
%>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
for(Product p : list){
%>
<tr>
<td><%=p.id%></td>
<td><%=p.name%></td>
<td><%=p.price%></td>
</tr>
<% } %>
</table>
<% } %>