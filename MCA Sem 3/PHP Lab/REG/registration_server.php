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

if (isset($_POST['submit'])) {
    $name = $_POST["name"];
    $email = $_POST["email"]; 
    $phone = $_POST["ph"];
    $password = $_POST["psw"];
    $hashed_p = password_hash($password, PASSWORD_DEFAULT);


    $sql = "insert into users(name,email,phone,password) values ('$name','$email','$phone','$hashed_p')";

    if (mysqli_query($con,$sql))
    {
        session_start();
        $_SESSION['loggedin'] = true;
        $_SESSION['user_email'] = $email;
        echo '<script>alert("New record inserted")</script>'; 
        header("Location: home_page.php");
    }

    else {
        echo '<script>alert("An error occured")</script>'; 
        }
    
    mysqli_close($con);

    }
?>
