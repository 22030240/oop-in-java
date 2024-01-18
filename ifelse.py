appleprize=int(input("enter the apple prize"))
budget=180
if(appleprize<=budget):
    print(" take 1kg apple")
else:
    print("do not add")
    
# elif--> multiple if else condition 

num=(int)(input("Enter number :"))
if(num<0):
    print("enter no is negative")
elif(num==0):
    print("number is zero:")
else:
    print("num is positive",num)
    
    
def day(ch):
    if(ch==1):
        print("Monday")
    elif(ch==2):
        print("Tuesday")
    elif(ch==3):
        print("Weansday")
    elif(ch==4):
        print("Touseday")
    elif(ch==5):
        print("Friday")
    elif(ch==6):
        print("saturday")
    elif(ch==6):
        print("Sunday")
    else:
        print("Invalid choice")

print("Demonstate of control statement -if,elif and else")
        
ch=int(input("Enter the choice:"))
N=day(ch)
print(N) 




num=int(input("enter no:"))

if(num<0):
    print("number is nagative ")
elif(num<=45):
    print("number is zero")
    if(num>0 and num<10):
        print(" number in between 0 to 10")
    elif(num> 10 and num < 40):
        print(" number in between 10 to 40")
else:
    print(" number is above 45")
    
    
    

# good morning sir

# Match case statement -> switch() sarkh
# pythone does not use break function in match

x=int(input(" Enter value:::::"))

match x:
    case 0:
        print(" x is zero")
    case 1:
        print(" case is 1:")
    case 2:
        print(" case is 3:")
    case 3:
        print("case is 3")
    case 4:
        print("case is 4:")
    case _ :             # default
        print(x)

