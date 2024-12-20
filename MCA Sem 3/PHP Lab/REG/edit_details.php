<?php
    session_start();
    if (!isset($_SESSION['loggedin']) || $_SESSION['loggedin'] !== true) {
        header("Location: login_form.html"); 
        exit();
    }

    // Database connection
$servername = "localhost";
$username = "root";
$password = "";
$database = "university";

$con = mysqli_connect($servername, $username, $password, $database);

// Check connection
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
    exit();
}

//Fetch data from database
$user_email = $_SESSION['user_email'];
$sql = "SELECT * FROM users WHERE email = '$user_email'";
$result = mysqli_query($con, $sql);
$user_data = mysqli_fetch_assoc($result);

if (!$user_data) {
    echo "User details not found.";
    exit();
}

$user_phone = $user_data['phone'];
$user_name = $user_data['name'];
$user_email = $user_data['email'];

if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['name']) && isset($_POST['phone']))
{
    $name = $_POST["name"];
    $phone = $_POST["phone"];
    $email = $_SESSION['user_email'];

    $sql = "update users set name = '$name', phone = '$phone' where email = '$email'";
    if (mysqli_query($con,$sql))
    {
        mysqli_close($con);
        header("Location: home_page.php");
    }

    else 
    {
        echo "<script>alert('An error occured')</script>";
    }   
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form with Name and Phone</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        .form-container h1 {
            margin-bottom: 20px;
            color: #343a40;
        }
        .form-container input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ced4da;
            border-radius: 5px;
            font-size: 16px;
        }
        .form-container button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Edit your Details</h1>
        <form action="" method="POST">
            <input type="text" name="name" value="<?= htmlspecialchars($user_name); ?>" placeholder="Enter your name" required/>
            <input type="text" name="phone" value="<?= htmlspecialchars($user_phone); ?>" placeholder="Enter your phone number" required />
            <button type="submit">Edit</button>
        </form>
    </div>
</body>
</html>
