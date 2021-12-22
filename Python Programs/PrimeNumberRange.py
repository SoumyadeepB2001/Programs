# prime number in a given range

def isPrime(n):
    i = 1
    f = 0
    while i <= n:
        if n % i == 0:
            f += 1
        i = i + 1
    if f == 2:
        print(n, end=" ")


l = int(input("Enter the lower bound "))
u = int(input("Enter the upper bound "))

for i in range(l, u+1):
    isPrime(i)
