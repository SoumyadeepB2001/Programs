# perfect number

n = int(input("Enter a number "))
s = 0

for i in range(1, n):
    if n % i == 0:
        s = s+i

if s == n:
    print("Perfect Number")
else:
    print("Not a Perfect Number")
