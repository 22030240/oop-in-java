# short if else statement because pythone is a rradable language


a=int(input("enter no:"))
b=int(input("enter no:"))

print("A") if (a>b) else print("B") 

#Enumerator function -> enumerator is build in function in pythone that allow you to loop over sequences .
#enumerator index start 0
marks=[23,45,67,17,26,90,2345]
for index,mark in enumerate(marks,start=1):
    print(mark)
    if(index==3):
        print("Akshay bhaya king he!!")
        






a=[2,5,7.86,67,88,99,100]
index=0
for mark in a:
    print(mark)
    if(index==3):
        print("Akshay bhai banega kuch na kuch to banega!!")
    index=index+1