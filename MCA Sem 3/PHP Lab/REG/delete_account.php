<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $database = "university";
    $con = mysqli_connect($servername,$username,$password,$database);
    if (!$con) {
        echo '<script>alert("Connection failed")</script>'; 
    }
    else {
        echo '<script>alert("connection established succesfully")</script>'; 
    }

    session_start();
    $user_email = $_SESSION['user_email'];
    $delete_sql = "DELETE FROM users WHERE email = '$user_email'";
        if (mysqli_query($con, $delete_sql)) {
            echo "Goodbye! Your account has been deleted.";
            exit();
        } else {
            echo "Failed to delete account.";
        }
?>