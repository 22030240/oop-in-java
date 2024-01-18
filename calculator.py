print(".........................calculator..........................")
print(" select which operation to perform : ")
print("1.ADD")
print("2.SUBTRACT")
print("3.MULTIPLICATION")
print("4.DIVISION")
print("5.increment and decrement ")

operation=int(input("Enter operation: press 1 for addition,press 2 for substraction, press 3 for multiplication,press 4 for division ,press 5 to check small and big number"))
num=int(input("Enter frist number:"))
num1=int(input("Enter second number :"))

if operation==1:
    sum=num+num1
    print("Sum of 2 number is:",sum)
elif operation==2:
    sub=num-num1
    print("substraction of 2 number is:",sub)
elif operation==3:
    mul=num*num1
    print("Multiplication of 2 number is:",mul)
elif operation==4:
    div=num1/num
    print("Division of 2 number is:",div)
elif operation==5:
    if num>num1:
     print("num 1 is gretter than num 2",num)
    else:
        print("num 2 is gretter than num 1",num1)
else:
    print("Invalid operation")
    