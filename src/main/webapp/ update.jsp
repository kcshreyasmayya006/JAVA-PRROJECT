<html>
<head>
<style>
body { font-family: Arial; background: #f0f0f0; }
.container {
    width: 400px; margin: auto; margin-top: 50px;
    background: white; padding: 20px; border-radius: 10px;
}
input { width: 100%; padding: 8px; margin: 8px 0; }
button { width: 100%; padding: 10px; background: orange; color: white; border: none; }
</style>
</head>

<body>
<div class="container">
<h2>Update Product</h2>

<form action="update" method="post">
Product ID: <input name="id"><br>
Name: <input name="name"><br>
Category: <input name="category"><br>
Price: <input name="price"><br>
Quantity: <input name="qty"><br>

<button type="submit">Update</button>
</form>
</div>
</body>
</html>