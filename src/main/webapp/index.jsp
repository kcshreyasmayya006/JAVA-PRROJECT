<!DOCTYPE html>
<html>
<head>
<title>Product Management</title>

<style>
body {
    margin: 0;
    font-family: Arial;
    height: 100vh;
    background: linear-gradient(to right, #6dd5ed, #8693ab);
    display: flex;
    justify-content: center;
    align-items: center;
}

.card {
    background: #e6e6e6;
    padding: 30px;
    border-radius: 15px;
    width: 350px;
    text-align: center;
    box-shadow: 0 5px 20px rgba(0,0,0,0.2);
}

h2 {
    margin-bottom: 25px;
}

.btn {
    display: block;
    padding: 12px;
    margin: 10px 0;
    color: white;
    text-decoration: none;
    border-radius: 8px;
    font-weight: bold;
}

.green { background: #4CAF50; }
.blue { background: #2196F3; }
.orange { background: #ff9800; }
.red { background: #f44336; }
.purple { background: #9c27b0; }

.btn:hover {
    opacity: 0.85;
}
</style>

</head>

<body>
<div class="card">
    <h2>Product Management System</h2>

    <a href="add.jsp" class="btn green">Add Product</a>
    <a href="display" class="btn blue">View Products</a>
    <a href="update.jsp" class="btn orange">Update Product</a>
    <a href="#" class="btn red">Delete Product</a>
    <a href="report.jsp" class="btn purple">Reports</a>
</div>
</body>
</html>