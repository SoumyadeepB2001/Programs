<!DOCTYPE html>
<html>

<head>
    <title>Registration form</title>
    <link rel="stylesheet" href="style.css">
    <script src="script.js"></script>
</head>

<body>
    <form action="server.php" onsubmit="return validateForm()" method="POST">
        <div class="container">
            <h1 class="heading">Register</h1>
            <p>Please fill in this form to create an account</p>
            <hr>
            <br>
            <label for="name"><b>Name: </b></label>
            <input type="text" placeholder="Enter Name" name="name" id="name" required>
            <br><br>
            <label for="email"><b>Email: </b></label>
            <input type="email" placeholder="Enter Email" name="email" id="email" required>
            <br><br>
            <label for="psw"><b>Password: </b></label>
            <input type="password" placeholder="Enter Password" name="psw" id="psw" required>
            <br><br>
            <label for="ph"><b>Phone No: </b></label>
            <input type="text" placeholder="Phone number" name="ph" id="ph" required>
            <br><br>
            <button type="submit" name="submit" class="submit-btn">Register</button>
            <button type="reset" class="reset-btn">Clear</button>
            <hr>
    </form>
</body>

</html>