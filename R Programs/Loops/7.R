v<-c()
n <- as.integer(readline(prompt = "Enter the length of the vector "))
for (i in 1:n){
  a <- as.integer(readline(prompt = "Enter a number "))
  v <- c(v,a)
}
print(v)

s <- as.integer(readline(prompt = "Enter a number to be searched "))
flag = 0
for (i in 1:n){
  if(s==v[i]){
    flag = 1
  }
}

if(flag==1){
  print("The number is found")
}else{
  print("The number is not found")
}
