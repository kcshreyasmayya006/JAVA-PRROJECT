<html>
<head>
<style>
body {
    font-family: Arial;
    background: #f0f0f0;
}

.container {
    width: 400px;
    margin: auto;
    margin-top: 50px;
    background: white;
    padding: 25px;
    border-radius: 10px;
}

h2 {
    text-align: center;
}

input {
    width: 100%;
    padding: 8px;
    margin: 8px 0;
}

button {
    width: 100%;
    padding: 10px;
    background: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
}

.back {
    display: block;
    margin-top: 10px;
    text-align: center;
}
</style>
</head>

<body>

<div class="container">
<h2>Add Product</h2>

<form action="add" method="post">
Product ID: <input name="id">
Name: <input name="name">
Category: <input name="category">
Price: <input name="price">
Quantity: <input name="qty">

<button type="submit">Add Product</button>
</form>

<a href="index.jsp" class="back">Back</a>

</div>

</body>
</html>