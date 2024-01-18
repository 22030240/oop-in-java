print("WRITE A PYTHON PROGRAM THAT PRINT ALL NUMBER FROM 0 TO 6 EXCEPT 3 USING CONTINUE STATEMENT")
N=int(input("Enter rows -->"))
for x in range (N):
    if(x==3):
        continue
    print(x)

        