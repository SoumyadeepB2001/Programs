<!DOCTYPE html>
<head>
    <title>Division with Exception Handling</title>
</head>
<body>
    <h1>Divide Two Numbers</h1>
    <form method="POST">
        <label for="number1">Enter the first number:</label>
        <input type="number" name="number1" required>
        <br><br>
        <label for="number2">Enter the second number:</label>
        <input type="number" name="number2" required>
        <br><br>
        <button type="submit">Divide</button>
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $num1 = $_POST['number1'];
        $num2 = $_POST['number2'];

        try {
            if ($num2 == 0) {
                throw new Exception("Division by zero is not allowed.");
            }

            $result = $num1 / $num2;
            echo "<h2>Result: $num1 / $num2 = $result</h2>";
        } 

        catch (Exception $e) {
            
            echo "<h2 style='color:red;'>Error: " . $e->getMessage() . "</h2>";
        } 
        
        finally {
            echo "<p>The execution has been completed.</p>";
        }
    }
    ?>
</body>
</html>
