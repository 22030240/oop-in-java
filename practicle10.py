# 1]pyramid
rows = int(input("Enter number of rows: "))

for i in range(rows):
    for j in range(i+1):
        print("* ", end="")
    print("\n")
    
# 2] pyramid

row=int(input("enter rows:->"))
for i in range(row):
    for j in range(i+1):
        
        print(j+1,end="")
    print("\n")
    
    
# 3] pyramid    
    r=1
    
row=int(input("enter rows:->"))
for i in range(row):
    for j in range(i+1):
        print(r,end="")
    r+=1
    print("\n")    
    
# 4] pyramid

row=int(input("Enter row:-->>"))
alphabet=65


for i in range(row):
    for j in range(i+1):
        r=chr(alphabet) 
        print(r,end="")
    
    alphabet+=1 
    print("\n") 
    
# 5] pyramid
#   * * * * *
#   * * * *
#   * * *
#   * *
#   *
print("--------------------------------------------------------------------------------------")
print(" Inverted half pyramid using ")  

row=int(input("------><><><> Enter rows <><><><-------"))

for i in range(row,0,-1):
    for j in range(0,i):
        print("*",end="")
    print("\n")    
        
# 6] pyramid

row=int(input("<><><<<>>><<>><<<>><<<>><<>------Enter the rows------>>>>><<<<>>><<<>>><<>><<>><>>"))

for i in range(row,0,-1):
    for j in range(0,i):
        print(j+1,end="")
    print("\n") 
      
    
    
row=int(input("<><><<<>>><<>><<<>><<<>><<>------Enter the rows------>>>>><<<<>>><<<>>><<>><<>><>>"))
k=5
for i in range(row,0,-1):
    for j in range(0,i):
        print(k,end="")
    print("\n") 
    k-=1
    
print("pascal triangle:")
rows = int(input("Enter number of rows: "))
coef = 1

for i in range(1, rows+1):
    for space in range(1, rows-i+1):
        print(" ",end="")
    for j in range(0, i):
        if j==0 or i==0:
            coef = 1
        else:
            coef = coef * (i - j)//j
        print(coef, end = " ")
    print()   
    
    
print ("Print full pyramid")
rows = int(input("Enter number of rows: "))

k = 0

for i in range(1, rows+1):
    for space in range(1, (rows-i)+1):
        print(end="  ")
   
    while k!=(2*i-1):
        print("* ", end="")
        k += 1
   
    k = 0
    print()     