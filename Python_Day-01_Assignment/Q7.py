num = int(input("enter 4 digit number"))
tot = 0
while(num > 0):
    num1 = num%10
    tot = tot + num1
    num = num//10

print("addition is : " ,tot)