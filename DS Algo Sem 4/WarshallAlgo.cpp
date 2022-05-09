#include <iostream>
using namespace std;

class WarshallAlgo
{
public:
	int adj[10][10], v;
	void input();
	void output();
	void path();
};

void WarshallAlgo::input()
{
	cout << "Enter the number of vertices" << endl;
	cin >> v;
	cout << "Enter the matrix" << endl;
	for (int i = 0; i < v; i++)
	{
		for (int j = 0; j < v; j++)
		{
			cin >> adj[i][j];
		}
	}
}

void WarshallAlgo::output()
{
	cout << "The matrix is : " << endl;
	for (int i = 0; i < v; i++)
	{
		for (int j = 0; j < v; j++)
		{
			cout << adj[i][j] << " ";
		}
		cout << endl;
	}
}

void WarshallAlgo::path()
{
	int k, i, j;
	for (k = 0; k < v; k++)
	{
		for (i = 0; i < v; i++)
		{
			for (j = 0; j < v; j++)
			{
				adj[i][j] = adj[i][j] | (adj[i][k] & adj[k][j]);
			}
		}
	}
}

int main()
{
	WarshallAlgo ob;
	ob.input();
	ob.output();
	ob.path();
	ob.output();
	return 0;
}
