#include <iostream>
#define MAX 20
using namespace std;
class AdjacencyMatrix
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

int AdjacencyMatrix::get_vertices()
{
	return vertices;
}

void AdjacencyMatrix::set_vertices()
{
	cin >> vertices;
}

void AdjacencyMatrix::set_values()
{
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
			cin >> value[i][j];
	}
}

void AdjacencyMatrix::get_values()
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

int AdjacencyMatrix::get_self_loop()
{
	int counter = 0;
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
		{
			if ((i == j) && value[i][j] >= 1)
				counter = counter + value[i][j];
		}
	}
	self_loop = counter;
	return counter;
}

int AdjacencyMatrix::get_edges()
{
	int edge = 0;
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
		{
			if (value[i][j] >= 1)
				edge = edge + value[i][j];
		}
	}
	return (edge + self_loop) / 2;
}

int main()
{
	AdjacencyMatrix ob;
	cout << "Enter the number of vertices" << endl;
	ob.set_vertices();
	cout << "Enter the values of the adjacency matrix" << endl;
	ob.set_values();
	cout << "Adjacency Matrix:" << endl;
	ob.get_values();
	cout << endl
		 << "No. of self loops: " << ob.get_self_loop() << endl;
	cout << "No. of edges: " << ob.get_edges() << endl;
}