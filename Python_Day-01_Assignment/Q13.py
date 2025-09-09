# Write a program to check if given number is prime or not.
#  Hint: Number is prime if not divisible by any number from 2 to that number -1

num = int(input("enter the number"))
i = 2
m = 0
while(num >= 2):
    if(num % i != 0):
        print("number is prime")
        m = 1
        m = m +1
        break
    i = i+1
    num = num-112
if(m ==0):
    print("number is not a prime numberee")

