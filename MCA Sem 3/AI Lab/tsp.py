# Write a Program to Implement Travelling Salesman Problem using Python.

# Python3 implementation of the approach
V = 4  # Number of vertices
answer = []  # To store all possible costs of Hamiltonian cycles

# Function to find the minimum weight Hamiltonian Cycle
def tsp(graph, v, currPos, n, count, cost, visited):
    # If the last node is reached and it has
    # a link to the starting node (source), add the cost of this path
    if count == n and graph[currPos][0]:
        answer.append(cost + graph[currPos][0])
        return

    # Loop through all vertices to find the next possible move
    for i in range(n):
        # If the node has not been visited and is connected
        if not visited[i] and graph[currPos][i]:
            # Mark as visited
            visited[i] = True
            # Recurse to the next node
            tsp(graph, v, i, n, count + 1, cost + graph[currPos][i], visited)
            # Backtrack to explore other possibilities
            visited[i] = False

# Driver code
if __name__ == "__main__":
    # Adjacency matrix for the graph
    graph = [
        [0, 10, 15, 20],
        [10, 0, 35, 25],
        [15, 35, 0, 30],
        [20, 25, 30, 0]
    ]

    # Boolean array to mark visited nodes
    visited = [False] * V
    # Start from the first node
    visited[0] = True

    # Call the TSP function
    tsp(graph, 0, 0, V, 1, 0, visited)

    # Print the minimum cost
    print(min(answer))
