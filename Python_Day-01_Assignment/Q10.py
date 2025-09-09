# Using a loop, write a program to find factorials from 0 to
#  10. 
num =10
fac = 1
num1 = 10
inn  = 0
while(num1 > 0):
    num = 10-inn
    while(num > 0):
        fac = fac*num
        num = num -1
    print(num1 ," ",fac)
    num1 = num1 -1
    fac = 1
    inn = inn+1
     

  

