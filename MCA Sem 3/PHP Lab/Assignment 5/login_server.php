<?php
// Database connection
$servername = "localhost";
$username = "root";
$password = "";
$database = "university";

$con = mysqli_connect($servername, $username, $password, $database);

// Check connection
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

// Check if form is submitted
if (isset($_POST['submit'])) {
    $email = $_POST['email'];
    $password = $_POST['psw'];

    // Query to check if the user exists
    $sql = "SELECT * FROM users WHERE email = '$email'";
    $result = mysqli_query($con, $sql);

    if (mysqli_num_rows($result) == 1) {
        // Fetch the user data
        $user_data = mysqli_fetch_assoc($result);              
        $user_email = $user_data['email']; 
        $hashed_user_pass =  $user_data['password']; 

        if(password_verify($password, $hashed_user_pass))
        {            
            session_start();
            $_SESSION['loggedin'] = true;
            $_SESSION['user_email'] = $user_email;
            header("Location: home_page.php");
        }

        else{
            echo "<h3>Incorrect password. Please try again.</h3>";
        }
    } 
    
    else {
        echo "<h3>No user found with this email. Please register first.</h3>";
    }
}

// Close connection
mysqli_close($con);
?>
