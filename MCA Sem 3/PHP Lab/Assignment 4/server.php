<?php
$servername = "localhost";
$username = "root";
$password = "";
$database = "university";
$con = mysqli_connect($servername,$username,$password,$database);
if (!$con) {
die("error detected".mysqli_error($con));
}
else {
echo("connection established succesfully");
}

if (isset($_POST['submit'])) {
    $name = $_POST["name"];
    $email = $_POST["email"]; 
    $phone = $_POST["ph"];
    $password = $_POST["psw"];
    $hashed_p = password_hash($password, PASSWORD_DEFAULT);

    echo "<h1>Registration Form</h1><br>" ;

echo "The Name is " . $name . "<br>" ;
echo "The Email ID is " . $email . "<br>" ;
echo "The Phone Number is " . $phone . "<br>" ;
echo "The Password is " . $hashed_p . "<br>" ;

$sql = "insert into users(name,email,phone,password) values ('$name','$email','$phone','$hashed_p')";

if (mysqli_query($con,$sql))
{
    echo "<script>alert('New Record Inserted')</script>";
}

else {
    echo "Error : ".mysqli_error($con);
    }
    mysqli_close($con);

}
?>