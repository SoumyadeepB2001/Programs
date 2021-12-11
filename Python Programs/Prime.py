# Prime number checking
n = int(input("Enter a number: "))
f = 0
i = 1
while i <= n:
    if n % i == 0:
        f += 1
    i += 1
if f == 2:
    print("Prime Number")
else:
    print("Not a prime number")
