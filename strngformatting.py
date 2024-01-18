letter="Hey my name is {} and i am from {}"
name=input("name is:")
gaon=input("Enter gaon:")

mauli=letter.format(name,gaon)
print(mauli)

# f-string in pythone

print(f"Hey my name is {name} and i am from {gaon}")
print(f"Hey my name is {{name}} and i am from {{gaon}}")

# docstring in pythone- docstring write above the statement or below function .

def squre(n):
    """take the hjhghghghnbsjdhjh
    fjkjjbjkkj
    jkkkjnj 
    njjb
    jjjj
    jiuinmfouqrhejfscdmxn,dkwouuhvjbmqnkjbkxcajksjnmjgiufkj nfoii ijuh kjwijdc joj jih ijb ih blsac jjcb """
    
    print(n**2)
squre(4)

print(squre.__doc__)

#  import this-->The Zen of Python, by Tim Peters
# PED 8 
 