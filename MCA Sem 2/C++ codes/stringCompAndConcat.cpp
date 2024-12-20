#include <iostream>
#include <string>

using namespace std;

class StringOperations {
public:
    string str;

    StringOperations(string s) {
        str = s;
    }

    bool compare(StringOperations other) {
        return str == other.str;
    }

    StringOperations concatenate(StringOperations other) {
        return StringOperations(str + other.str);
    }

    void display() {
        cout << str << endl;
    }
};

int main() {
    string s1, s2;

    cout << "Enter the first string: ";
    getline(cin, s1);
    cout << "Enter the second string: ";
    getline(cin, s2);

    StringOperations str1Obj(s1), str2Obj(s2);

    // Compare strings
    if (str1Obj.compare(str2Obj)) {
        cout << "The strings are equal." << endl;
    } else {
        cout << "The strings are not equal." << endl;
    }

    // Concatenate strings
    StringOperations concatenatedStr = str1Obj.concatenate(str2Obj);
    cout << "Concatenated string: ";
    concatenatedStr.display();

    return 0;
}
