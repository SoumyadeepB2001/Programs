<?php
// Start the session to access session variables
session_start();

// Check if the session variables are set
if (isset($_SESSION['user_name'])) {
    echo "Name (from session variable): " . $_SESSION['user_name'] . "<br>";
} else {
    echo "Name (from session variable): Not Set<br>";
}

if (isset($_SESSION['user_email'])) {
    echo "Email (from session variable): " . $_SESSION['user_email'] . "<br>";
} else {
    echo "Email (from session variable): Not Set<br>";
}

if (isset($_SESSION['user_phone'])) {
    echo "Phone (from session variable): " . $_SESSION['user_phone'] . "<br>";
} else {
    echo "Phone (from session variable): Not Set<br>";
}

// Check if the cookie 'user_password' is set
if (isset($_COOKIE['user_password'])) {
    echo "Stored Password (from Cookie): " . $_COOKIE['user_password'] . "<br>";
} else {
    echo "Stored Password (from Cookie): Not Set<br>";
}
?>
