n1 = int(input("Enter the marks in sub 1 "))
n2 = int(input("Enter the marks in sub 2 "))
n3 = int(input("Enter the marks in sub 3 "))

total = n1+n2+n3
avg = total//3

if avg >= 40:
    if avg >= 60:
        if avg >= 70:
            if avg >= 80:
                grade = 'A'
            else:
                grade = 'B'
        else:
            grade = 'C'
    else:
        grade = 'D'
else:
    grade = 'E'

print("Grade is ", grade)
