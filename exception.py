# Exception Handling-> exception handling is the process of responding to unwanted or unexpected event when computer program runs.
# Exception handling deals with these event to avoid the program or system cresing and without this process ,
#exception would distrupt the normal operation of a program .

# Exceptions in Pythone 
#pythone try...except

a=(input("Enter the number:"))
print(f"Multiplication table of {a} is:")
try:
     for i in range(1,11):
      print(int(i*a))
except:
    print("invalid input")
    
print("jay ho chal gaya")
print("maja ya gaya!!")

# 2> problem 

try:
    num=int(input("Enter no:"))
    a=[2,4,7]
    print(a[num])
except ValueError:
    print("Value error are occer:")
except IndexError:
    print("index error occure:")
    
#3> problem 
try:
    l=[1,2,3,5,6,8,8]
    ind=int(input("Enter index num:"))
    print(l[ind])
except:
    print("Some error occure:")
    
#finally-> alwayes executed 
finally:
    print("I am alwayes executed ")