print("Enter 1 to convert from Fahrenheit to Celsius")
print("Enter 2 to convert from Celsius to Fahrenheit")
ch = int(input())
if ch == 1:
    f = float(input("Enter the temp in Fahrenheit "))
    c = (5*(f-32))/9
    print("Temperature in Celsius is", c)
elif ch == 2:
    c = float(input("Enter the temp in Celsius "))
    f = ((9*c)/5)+32
    print("Temperature in Fahrenheit is", f)
else:
    print("Wrong Input")
