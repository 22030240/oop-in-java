import random
#random labrary take radome data variable.
def check(user,comp):
    if(comp==user):
        return 0
    # only take lose condition either all are aprove.
    elif(comp==0 and user==1):
        return -1
    elif(comp==1 and user==2):
        return -1
    elif(comp==2 and user==0):
        return -1
    # if not any lose condition then give a mark 1
    else:
        return 1
print("Welcome to snake gun water game:")
while(1):   
 user=int(input("0 for snake or 1 for water and 2 for gun :"))
 comp=random.randint(0,2)

    
 score=check(user,comp)
 print("you:->",user)
 print("computer:->",comp)
 if(score==0):
     print("it a draw")
 elif(score==-1):
     print("it a lose")
 else:
     print("it a won")
     break
     
     
     
           



