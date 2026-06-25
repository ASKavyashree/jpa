<!DOCTYPE html>
<html>
<head>
    <title>Add Book</title>
</head>
<body>

<h2>Add New Book</h2>

<form action="addBook" method="post">
    <div>
    <label>Title:</label>
    <input type="text" name="title" required>
    </div><br>

    <div>
    <label>Author:</label>
    <input type="text" name="author" required>
    </div><br>

    <div>
    <label>Price:</label>
    <input type="number" step="0.01" name="price" required >
    </div><br>

    <div>
    <label>Category:</label>
    <input type="text" name="category" required>
    </div><br>

    <div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>


</form>
<h3 style="color:${color}">${message}</h3>
</body>
</html>