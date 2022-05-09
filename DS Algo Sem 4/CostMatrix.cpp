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
	void edge_sort();
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

void CostMatrix::edge_sort()
{
	char vertex[MAX], source[vertices], destination[vertices];
	vertex[0] = 'A';
	int i, j, counter = 0, min, minIndex, s, d;
	int sort[vertices * vertices]; // Array to sort the edges;

	for (i = 1; i < vertices; i++)
		vertex[i] = vertex[i - 1] + 1;

	cout << "Before Sorting, Cost Of Edges:" << endl;
	for (int i = 0; i < vertices; i++)
	{
		for (int j = 0; j < vertices; j++)
		{
			cout << vertex[i] << vertex[j] << " = " << value[i][j] << endl;

			sort[counter] = value[i][j];
			source[counter] = vertex[i];
			destination[counter] = vertex[j];
			counter++;
		}
	}

	cout << "After Sorting, Cost Of Edges:" << endl;

	int temp;
	char temp2, temp3;
	for (int i = 0; i < vertices * vertices; i++)
	{
		for (int j = 0; j < vertices * vertices - i - 1; j++)
		{
			if (sort[j] > sort[j + 1])
			{
				temp = sort[j];
				sort[j] = sort[j + 1];
				sort[j + 1] = temp;

				temp2 = source[j];
				source[j] = source[j + 1];
				source[j + 1] = temp2;

				temp3 = destination[j];
				destination[j] = destination[j + 1];
				destination[j + 1] = temp3;
			}
		}
	}

	for (i = 0; i < vertices * vertices; i++)
		cout << source[i] << destination[i] << " = " << sort[i] << endl;
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
	ob.edge_sort();
}