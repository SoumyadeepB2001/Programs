# Grade Calculation
n1 = int(input("Enter a number: "))
n2 = int(input("Enter a number: "))
n3 = int(input("Enter a number: "))
avg = (n1+n2+n3)//3

if avg >= 35:
    if avg >= 50:
        if avg >= 70:
            if avg >= 90:
                grade = 'A'
            else:
                grade = 'B'
        else:
            grade = 'C'
    else:
        grade = 'D'
else:
    grade = 'E'

print("Grade =", grade)
