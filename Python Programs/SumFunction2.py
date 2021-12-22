def sum(a, b=10):
    s = a + b
    return s


a = int(input("Enter a number "))
b = int(input("Enter a number "))
c = sum(a)
print("Sum is", c)
c = sum(a, b)
print("Sum is", c)
