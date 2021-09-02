s=input("Enter a string to check: ")
if s.upper()==s[::-1].upper():  #::-1 reverses the string
	print (s+" is a Palindrome String")
else:
	print(s+" is not a Palindrome String")