<?php
    $file_path = "test.txt";
    $file = fopen($file_path, "r");

    if ($file) {
        while (!feof($file)) {
            // Read a line from the file
            $line = fgets($file);
            
            echo $line . "<br>";
        }
        fclose($file);
    }
   
    else {
        // Error handling if file cannot be opened
        echo "Unable to open file: $file_path";
    }

    if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['text']))
    {
        $file_path = "test.txt";
        
        if(isset($_POST['update']))
        {
            $file = fopen($file_path, "w");
        }

        if(isset($_POST['append']))
        {
            $file = fopen($file_path, "a");
        }

        if ($file) {
            // Content to write to the file
            $content = $_POST['text'] . "\n";
        
            // Write content to the file
            fwrite($file, $content);
        
            // Close the file after writing
            fclose($file);
        
        } else {
            echo "Error opening the file.";
        }
        

        //Read the contents of the updated file
        $file_path = "test.txt";
        $file = fopen($file_path, "r");

    if ($file) {
        ob_clean();
        flush();
        while (!feof($file)) {
            // Read a line from the file
            $line = fgets($file);
            
            echo $line . "<br>";
        }
        fclose($file);
    }
   
    else {
        // Error handling if file cannot be opened
        echo "Unable to open file: $file_path";
    }
    }
?>

<!DOCTYPE html>
<html>
    <form action="" method="POST">
        <input type="text" name="text" />
        <button type="submit" name="update">Update with this text</button>
        <button type="submit" name="append">Append this line</button>
    </form>
</html>