# fibonacci series

n1 = 0
n2 = 1

n <- as.integer(readline(prompt = "Enter the length of the series "))
print(n1)
print(n2)
j = n-2
for(i in 1:j){
  n3 = n1+n2
  print(n3)
  n1 = n2
  n2 = n3
}
