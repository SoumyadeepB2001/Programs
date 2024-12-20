#include <iostream>
using namespace std;
class Matrix
{
    static const int m = 3;
    static const int n = 3;
    int mat[m][n];

public:
    // Method to input matrix elements from user
    void input()
    {
        cout << "Enter the elemnts of the matrix(" << m << "x" << n << "): ";
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cin >> mat[i][j];
            }
        }
    }
    Matrix operator+(Matrix &M)
    {
        Matrix result;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                result.mat[i][j] = this->mat[i][j] + M.mat[i][j];
            }
        }
        return result;
    }
    Matrix operator-(Matrix &M)
    {
        Matrix result;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                result.mat[i][j] = this->mat[i][j] - M.mat[i][j];
            }
        }
        return result;
    }
    Matrix operator*(Matrix &M)
    {
        Matrix result;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                result.mat[i][j] = 0;
                for (int k = 0; k < n; k++)
                {
                    result.mat[i][j] += this->mat[i][k] * M.mat[k][j];
                }
            }
        }
        return result;
    }
    void display()
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cout << mat[i][j] << " ";
            }
            cout << endl;
        }
    }
};

int main()
{
    Matrix M1, M2;
    cout << "Matrix 1:" << endl;
    M1.input();
    cout << "Matrix 2:" << endl;
    M2.input();
    Matrix sum = M1 + M2;
    cout << "Matrix 1:" << endl;
    M1.display();
    cout << "Matrix 2:" << endl;
    M2.display();
    cout << "Sum of matrices:" << endl;
    sum.display();
    Matrix diff = M1 - M2;
    cout << "Diff of matrices: " << endl;
    diff.display();
    Matrix Product = M1 * M2;
    cout << "Product of matrices: " << endl;
    Product.display();
    return 0;
}