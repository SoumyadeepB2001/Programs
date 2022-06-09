# sum and average

n <- as.integer(readline(prompt = "Enter a number "))

i = 1
sum = 0
while(i<=n){
  sum = sum + i
  i = i + 1
}
avg = sum / n

cat(sum, "is the sum \n")
cat(avg, "is the average")
