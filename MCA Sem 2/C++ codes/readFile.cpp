#include <fstream>
#include <iostream>
#include <string>

using namespace std;

int main() {
    ifstream ifs("student.txt"); // Open the file for reading
    if (!ifs.is_open()) {
        cout << "Cannot open the file" << endl;
        return 1; // Return an error code
    }

    int lineCount = 0;
    int blankSpaceCount = 0;
    int charCount = 0;
    string line;

    while (getline(ifs, line)) {
        lineCount++; // Count each line

        for (size_t i = 0; i < line.size(); ++i) {
            if (line[i] == ' ') {
                blankSpaceCount++; // Count blank spaces
            }
            charCount++; // Count characters
        }
    }

    ifs.close(); // Close the file

    // Output the results
    cout << "Total number of lines: " << lineCount << endl;
    cout << "Total number of blank spaces: " << blankSpaceCount << endl;
    cout << "Total number of characters: " << charCount << endl;

    return 0;
}
