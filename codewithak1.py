# calculator using pythone

a=int(input("enter value of a:"))
b=int(input("enter value of b:"))  #  alt+shift+down  for reapeting line  

f=print("the value of ",a,"+",b,"is", a+b)
f=print("the value of ",a,"-",b,"is", a-b)  # alt and select to multiple corses 
f=print("the value of ",a,"*",b,"is", a*b)
f=print("the value of ",a,"/",b,"is", a/b)


# typecasting 
# typecasting is conversion of one deta type to another .
#1.  Explicit typecasting-> conversion of data type is done by user or programmer is manually .

a= "1.2"
b= "2.3"
print(a+b)
#2.  implicit typecasting ->> when compiler should convert one deta to another is know  as implicit typecasting
a=3
b=5.5
print(a+b)


# user input-> is done by input() function 


# string ->  collection of carecters and it in double column " akshay"  
name=input("Enter name of user:")
print(name+"dange")
print("hello"+ name)
# multiple line string is done by using '''       ''' or """   """

akshay=''' hi akshay 
what is you name 
what u happend now
xnbb kjjhe kjhjg hwj askjheugnv dange jjycce hjhhggcjh98+99+jbyugkjxkiow8hghbkusu9uaskhbnbuyc
ajghsyuuienm;m,
mnjkiudf0,m,
nkfjloifd9
,skfj93
6+9j,hk9

dsvklf9i
klko-ij
aksjiumcvl
dskjip
'''
print(akshay)


# find index value of string ( index start from zero  :::)

a="HARRY"
print(a[0])
print(a[1])
print(a[2])
print(a[3])
print(a[4])
# index error-> those error means which element is find they does not access that position 

# interation is done by for loop

print(" iterate by using for loop:")
for carecter in a:
    print(carecter)
    
for car in akshay:
    print(car)
    
    
# string slicing & and operation on string ->
 #slicing
aa = "akshay,ritesh"
print(aa[0:4])
# nagative slicing 
print(aa[0:-3])    #   print(aa[0:len(aa)-3])
print(aa[-1:-3])   #   print(aa[len(aa)-1:len(aa)-3])

 
 #2.length-> len()
print(len(aa))

 # string method->string are immutable ( change nahi hou shakt jagchya jagi but te aapn method ni karu shakto)
 #1.upper
 #2.lowwer
dange="akshay"
print(dange.upper())
dd= "GGHHHkjhj"
print(dd.lower())
 # 3.rstrip
 
df="hhssg!!!!!!!!"
print(df.rstrip("!"))
ff="1111h sdhjh1 31111"
print(ff.rstrip("1"))

# replace -> raplace all occurance 

print(ff.replace("hsdhjh","akshay"))

#split ()-> convert string into list 

print(ff.split(" "))

# capitalize -> convert blog into capitalize.. also convert in between carecters 

hh="introduction to python"
print(hh.capitalize())

# 5. center()-> add multiple spaces 

print(len(hh))
print(ff.center(50))

# count()-> count repeted 

fg="jh@@@@jh@@@@jh@@"
print(fg.count("jh"))

# endswith()--> chack the string with given string (boolean)
print(fg.endswith("@@"))

# find()-> find the value or string
gf=" ajhjg7jhsjj5fhf7ghsg5"
print(gf.find("5"))

# index()  -> searching the given value if it is present then then print the occurance if it is not present then they raise an exception(error)
j="jkh djkj kjkj @ mkjk kjsk  "
print(j.index("@"))
#   print(j.index("!"))

# isalnum()-->  A TO Z and a to z  and 0 to 9 asin th true nahitar false 
print(j.isalnum())

#isalpha ()  ->   only alphabet(A to Z   and  a To z) are prent then they give true either false

print(j.isalpha())

# islower()-> is return true if the all element are lowercase 

g="DGJJJKJHJKkllkjhlkjhggl;akshay\n"
print(g.islower())

# isprintable()-> they give true if all the value are printable 

print(g.isprintable())
# isspaces()-> return true then they give spaces 
g="     hh    "
print(g.isspace())
# istitle()

# isupper()
#isstartwith()
 
 # title ()
 
 
 
 
# if - else statement ->  
# conditional operator < ,>,<= ,>= ,== 

a=int(input("enter your age"))
print("your age is:",a)

if(a>18):
    print("you eligible to drave a car")
    
else:
    print("YOU are not eligible")
    








