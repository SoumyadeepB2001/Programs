#include <iostream>
#include <string>
using namespace std;

class MyString {
public:
    string str;

    MyString() {}

    MyString(string s) {
        str = s;
    }

    MyString& operator+=(const MyString& S1) {
        str += S1.str;
        return *this;
    }

    MyString operator+(const MyString& S1) const {
        MyString temp = *this;
        temp += S1;
        return temp;
    }

    friend ostream& operator<<(ostream& os, const MyString& s) {
        os << s.str;
        return os;
    }
};

int main() {
    string st1,st2;
    cout<<"Enter 2 strings"<<endl;
    cin>>st1>>st2;
    MyString s1(st1), s2(st2), s3;
    s1 += s2;
    cout << s1 << endl; 
    s3 = s1 + s2;
    cout << s3 << endl; 
    return 0;
}