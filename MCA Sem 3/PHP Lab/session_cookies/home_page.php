<?php
session_start();

if (!isset($_SESSION['loggedin']) || $_SESSION['loggedin'] !== true) {
    header("Location: login_form.html");
    exit();
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    session_unset();
    session_destroy();
    
    foreach ($_COOKIE as $cookie_name => $cookie_value) {
        setcookie($cookie_name, '', time() - 3600, '/');
    }

    echo "<script>alert('Log-out successful')</script>";
    exit();
}

$user_phone = $_SESSION['user_phone'];
$user_name = $_SESSION['user_name'];
$user_email = $_COOKIE['user_email'];
?>


<!DOCTYPE html>
<head>
    <title>Account Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f9;
        }
        .account-container {
            max-width: 600px;
            margin: auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
        }
        .user-details {
            margin: 20px 0;
        }
        .user-details p {
            margin: 5px 0;
        }
        
        .buttons button {
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

    </style>
</head>
<body>
    <div class="account-container">
        <h1>Welcome, <?= htmlspecialchars($user_name); ?>!</h1>
        <div class="user-details">
            <h3>Your Account Details:</h3>
            <p><strong>Full Name:</strong> <?= htmlspecialchars($user_name); ?></p>
            <p><strong>Email:</strong> <?= htmlspecialchars($user_email); ?></p>
            <p><strong>Phone:</strong> <?= htmlspecialchars($user_phone); ?></p>

        </div>
        <div class="buttons">            
        <form action="edit_details.php">
            <button type="submit" style="background-color: #007bff; color: #fff;">Edit Account</button>
        </form>     
        <br><br>
        <form action="delete_account.php" method="POST">
                <button type="submit" style="background-color: #dc3545; color: #fff;">Delete Account</button>
        </form>
        <br><br>
        <form action="" method="POST">
                <button type="submit" style="background-color: #dc3545; color: #fff;">Log-out</button>
        </form>
        </div>
    </div>
</body>
</html>