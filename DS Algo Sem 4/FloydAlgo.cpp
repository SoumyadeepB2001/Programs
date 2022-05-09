#include <iostream>
using namespace std;

class FloydAlgo
{
public:
	int cost[10][10], v;
	void input();
	void output();
	void shortest_path();
};

void FloydAlgo::input()
{
	cout << "Enter the number of vertices" << endl;
	cin >> v;
	cout << "Enter the matrix" << endl;
	for (int i = 0; i < v; i++)
	{
		for (int j = 0; j < v; j++)
		{
			cin >> cost[i][j];
		}
	}
}

void FloydAlgo::output()
{
	cout << "The matrix is : " << endl;
	for (int i = 0; i < v; i++)
	{
		for (int j = 0; j < v; j++)
		{
			cout << cost[i][j] << " ";
		}
		cout << endl;
	}
}

void FloydAlgo::shortest_path()
{
	int k, i, j;
	for (k = 0; k < v; k++)
	{
		for (i = 0; i < v; i++)
		{
			for (j = 0; j < v; j++)
			{
				if (cost[i][j] > cost[i][k] + cost[k][j])
				{
					cost[i][j] = cost[i][k] + cost[k][j];
				}
			}
		}
	}
}

int main()
{
	FloydAlgo ob;
	ob.input();
	ob.output();
	ob.shortest_path();
	ob.output();
	return 0;
}
