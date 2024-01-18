import cmath

a=int(input("Enter value of a:"))
b=int(input("Enter value of b:"))
c=int(input("Enter value of c:"))

d=cmath.sqrt(b*2)-(4*a*c)

sol1=(-b+d)/(2*a)
sol2=(-b-d)/(2*a)

print("Solution is:-->")
print(sol1)
print(sol2)