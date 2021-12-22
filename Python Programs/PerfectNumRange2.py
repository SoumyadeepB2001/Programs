l = int(input("Enter the lower bound "))
u = int(input("Enter the upper bound "))

for i in range(l, u+1):
    s = 0

    for j in range(1, i):
        if i % j == 0:
            s = s+j
    if s == i:
        print(i, end=" ")
