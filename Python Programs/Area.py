import math

print("Enter 1 to calculate the area of a rectangle")
print("Enter 2 to calculate the area of a square")
print("Enter 3 to calculate the area of a circle")
print("Enter 4 to calculate the area of a triangle")

ch = int(input())

if ch == 1:
    l = float(input("Enter the Length "))
    b = float(input("Enter the Breadth "))
    area = l*b
    print("Area is", area)
elif ch == 2:
    s = float(input("Enter the side "))
    area = s*s
    print("Area is", area)
elif ch == 3:
    r = float(input("Enter the Radius "))
    area = math.pi*r*r
    print("Area is", area)
elif ch == 4:
    b = float(input("Enter the Base "))
    h = float(input("Enter the Height "))
    area = 0.5*b*h
    print("Area is", area)
else:
    print("Wrong Input")
