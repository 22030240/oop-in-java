
def gcd(a,b):
    # base case 
    if(b==0):
        return a
    else:
        return gcd(b,a%b)
    
    
a=int(input("Enter value of a:"))
b=int(input("Enter value of b:"))
GCD=gcd(a,b)
print("Gcd is:")
print(GCD)






