<?php
// Database connection details
$servername = "localhost";
$username = "root";
$password = "";
$database = "university";

// Connect to the database
$conn = new mysqli($servername, $username, $password, $database);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// 1. Fetch the first 50 entries
echo "<h3>First 50 Entries:</h3>";
$sql_first_50 = "SELECT * FROM Cars ORDER BY id ASC LIMIT 50";
$result_first_50 = $conn->query($sql_first_50);

if ($result_first_50->num_rows > 0) {
    while ($row = $result_first_50->fetch_assoc()) {
        echo "ID: " . $row['id'] . " - Car Model: " . $row['car_model'] . " - Launch Year: " . $row['launch_year'] . "<br>";
    }
} else {
    echo "No entries found.";
}

// 2. Fetch entries 20 to 50
echo "<h3>Entries 20 to 50:</h3>";
$sql_20_to_50 = "SELECT * FROM Cars LIMIT 19, 31;";
$result_20_to_50 = $conn->query($sql_20_to_50);

if ($result_20_to_50->num_rows > 0) {
    while ($row = $result_20_to_50->fetch_assoc()) {
        echo "ID: " . $row['id'] . " - Car Model: " . $row['car_model'] . " - Launch Year: " . $row['launch_year'] . "<br>";
    }
} else {
    echo "No entries found.";
}

// 3. Fetch the last 50 entries
echo "<h3>Last 50 Entries:</h3>";
$sql_last_50 = "(SELECT * FROM Cars ORDER BY id DESC LIMIT 50) ORDER BY id ASC;";
$result_last_50 = $conn->query($sql_last_50);

if ($result_last_50->num_rows > 0) {
    while ($row = $result_last_50->fetch_assoc()) {
        echo "ID: " . $row['id'] . " - Car Model: " . $row['car_model'] . " - Launch Year: " . $row['launch_year'] . "<br>";
    }
} else {
    echo "No entries found.";
}

// Close the database connection
$conn->close();
?>
