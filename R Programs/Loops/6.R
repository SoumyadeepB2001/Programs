v<-c()
n <- as.integer(readline(prompt = "Enter a number "))
for (i in 1:n){
  a <- as.integer(readline(prompt = "Enter a number "))
  v <- c(v,a)
}

print(v)
