#include <iostream>
#define MAX 20
using namespace std;
class CostMatrix
{
public:
	int value[MAX][MAX];
	int vertices;
	int self_loop;
	int get_vertices();
	void get_values();
	void set_vertices();
	void set_values();
	int get_self_loop();
	int get_edges();
};

int CostMatrix::get_vertices()
{
	return vertices;
}

void CostMatrix::set_vertices()
{
	cin >> vertices;
}

void CostMatrix::set_values()
{
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
			cin >> value[i][j];
	}
}

void CostMatrix::get_values()
{
	cout << endl;
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
		{
			cout << value[i][j];
			cout << " ";
		}
		cout << endl;
	}
}

int CostMatrix::get_self_loop()
{
	int counter = 0;
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
		{
			if ((i == j) && value[i][j] >= 1)
				counter++;
		}
	}
	self_loop = counter;
	return counter;
}

int CostMatrix::get_edges()
{
	int edge = 0;
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
		{
			if (value[i][j] >= 1 && value[i][j] < 9999)
				edge++;
		}
	}
	return (edge + self_loop) / 2;
}

int main()
{
	CostMatrix ob;
	cout << "Enter the number of vertices" << endl;
	ob.set_vertices();
	cout << "Enter the values of the cost matrix" << endl;
	ob.set_values();
	cout << "Cost Matrix:" << endl;
	ob.get_values();
	cout << endl
		 << "No. of self loops: " << ob.get_self_loop() << endl;
	cout << "No. of edges: " << ob.get_edges() << endl;
}