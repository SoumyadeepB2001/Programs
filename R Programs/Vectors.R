#Vector is a kind of one dimensional array in R. It is an one dimensional set of values of the same type.
a <- 1:10
a

b <- c(1,2,3,4)
b

rm(a)
a #Error: object 'a' not found
#Execution halted

#str() shows the data type dimension and value of a vector
a <- 1:10
str(a)

b <- c('abc', 'xyz', 'aaa')
str(b)

c <- c(1.1, 2.2, 3.3)
str(c)

#Checking the type of vector
is.numeric(c)
is.numeric(a)
is.integer(a)
is.integer(b)

#Checking the length of vector
length(a) #10
length(b) #3
length(c) #3

#Sequence
d <- seq(1,10)
d

e<- seq(1,10, by=2)
e

f <- seq(from=1, to=10, by=2)
f

g <- seq(10,1, by=-1)
g 

h <- seq(1,10,3)
h

i<- seq(from=1, to=10, length.out=5)
i

#Temporary Vector (vector which is not stored in a variable)
1:10

#Concatenation of two vectors
a <- 1:10
a
b <- c(1.1, 2.2, 3.3)
b
c <- c(a,b)
c

#Repetition
k <- seq(1, 10, 2.5)
k
rep(k, times=2)
rep(k, each=2)