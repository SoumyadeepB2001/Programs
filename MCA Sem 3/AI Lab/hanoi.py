# Recursive Python function to solve the Tower of Hanoi problem
def TowerOfHanoi(n, source, destination, auxiliary):
    if n == 1:
        print("Move disk 1 from source", source, "to destination", destination)
        return
    
    TowerOfHanoi(n - 1, source, auxiliary, destination)
    print("Move disk", n, "from source", source, "to destination", destination)
    TowerOfHanoi(n - 1, auxiliary, destination, source)

# Driver code
n = 4  # Number of disks
TowerOfHanoi(n, 'A', 'B', 'C')  
# A, B, C are the names of the rods
