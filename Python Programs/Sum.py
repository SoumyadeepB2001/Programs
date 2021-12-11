# Sum of all integers from 1 to n
n = int(input("Enter a number: "))
sum = 0
i = 1
while i <= n:
    sum = sum+i
    i = i+1
print("Sum =", sum)
