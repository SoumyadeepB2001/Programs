n = int(input("Enter the number of terms "))
f1 = 0
f2 = 1
print(f1, end=" ")
for x in range(1, n):
    print(f2, end=" ")
    f3 = f1 + f2
    f1 = f2
    f2 = f3
