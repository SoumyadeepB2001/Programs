# perfect number in a given range

def perfect(n):
    s = 0
    for i in range(1, n):
        if n % i == 0:
            s = s+i

    if s == n:
        return 1
    else:
        return 0


l = int(input("Enter the lower bound "))
u = int(input("Enter the upper bound "))

for i in range(l, u+1):
    if perfect(i) == 1:
        print(i, end=" ")
