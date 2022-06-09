v<-c()
n <- as.integer(readline(prompt = "Enter the length of the vector "))
for (i in 1:n){
  a <- as.integer(readline(prompt = "Enter a number "))
  v <- c(v,a)
}
print(v)

max = v[1]
min = v[1]
for(i in 1:n){
  if (v[i]>max){
    max = v[i]
  }
  if (v[i]<min){
    min = v[i]
  }
}

cat(max,"is Max \n")
cat(min,"is Min")
