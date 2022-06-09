v<-c()
n <- as.integer(readline(prompt = "Enter the length of the vector "))
for (i in 1:n){
  a <- as.integer(readline(prompt = "Enter a number "))
  v <- c(v,a)
}
print(v)

sum = 0
for(i in 1:n){
  sum = sum + v[i]
}
avg = sum / n

cat(sum,"is sum \n")
cat(avg,"is average")
