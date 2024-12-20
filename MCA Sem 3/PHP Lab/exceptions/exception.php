<!DOCTYPE html>
<head>
    <title>Square Root Calculator</title>
</head>
<body>
    <h1>Square Root Calculator</h1>
    <form method="POST">
        <label for="number">Enter a number:</label>
        <input type="text" id="number" name="number" required>
        <button type="submit">Calculate</button>
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $number = (float)$_POST['number'];
        try {
            // Validate the input
            if ($number < 0) {
                throw new Exception("Cannot calculate square root of a negative number: $number");
            }
    
            $result = sqrt($number);
            echo "The square root of $number is $result.<br>\n";
        } catch (Exception $e) {
            // Handle exceptions
            echo "<span style='color: red;'>Error: </span>" . $e->getMessage() . "<br>\n";
        } finally {
            // Code that always executes
            echo "<br>Operation completed.";
        }
    }
    ?>
</body>
</html>
