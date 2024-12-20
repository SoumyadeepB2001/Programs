#include <iostream>
#include <cmath>

class AREA {
private:
    const double PI = 3.14159265358979323846;

public:
    // Function to calculate area of rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Function to calculate area of triangle using Heron's formula
    double calculateArea(double a, double b, double c) {
        // Calculate semi-perimeter
        double s = (a + b + c) / 2;
        // Use Heron's formula
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Function to calculate area of circle
    double calculateArea(double radius) {
        return PI * radius * radius;
    }
};

int main() {
    AREA area;
    double result;

    // Rectangle
    double length, width;
    std::cout << "Enter length of rectangle: ";
    std::cin >> length;
    std::cout << "Enter width of rectangle: ";
    std::cin >> width;
    result = area.calculateArea(length, width);
    std::cout << "Area of rectangle: " << result << std::endl;

    // Triangle
    double a, b, c;
    std::cout << "\nEnter length of first side of triangle: ";
    std::cin >> a;
    std::cout << "Enter length of second side of triangle: ";
    std::cin >> b;
    std::cout << "Enter length of third side of triangle: ";
    std::cin >> c;
    result = area.calculateArea(a, b, c);
    std::cout << "Area of triangle: " << result << std::endl;

    // Circle
    double radius;
    std::cout << "\nEnter radius of circle: ";
    std::cin >> radius;
    result = area.calculateArea(radius);
    std::cout << "Area of circle: " << result << std::endl;

    return 0;
}