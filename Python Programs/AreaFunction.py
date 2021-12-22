import math

def area_rect():
    l = float(input("Enter the Length "))
    b = float(input("Enter the Breadth "))
    area = l*b
    print("Area is", area)


def area_square():
    s = float(input("Enter the side "))
    area = s*s
    print("Area is", area)


def area_circle():
    r = float(input("Enter the Radius "))
    area = math.pi*r*r
    print("Area is", area)


def area_triangle():
    b = float(input("Enter the Base "))
    h = float(input("Enter the Height "))
    area = 0.5*b*h
    print("Area is", area)


print("Enter 1 to calculate the area of a rectangle")
print("Enter 2 to calculate the area of a square")
print("Enter 3 to calculate the area of a circle")
print("Enter 4 to calculate the area of a triangle")

ch = int(input())

if ch == 1:
    area_rect()
elif ch == 2:
    area_square()
elif ch == 3:
    area_circle()
elif ch == 4:
    area_triangle()
else:
    print("Wrong Input")
