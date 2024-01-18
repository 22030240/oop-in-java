import time
t=time.strftime("%H:%M:%S")
hour=(time.strftime("%H:%M:%S"))
print(hour)
hour2=int(input("Enput time from user:"))

if(hour2>=0 and hour2<12):
    print("Good morning ",hour2)
    
elif(hour2>=12 and hour2<17):
    print("Good afternoon sir",hour2)
if(hour2>=17 and hour2<0):
    print("Good night ",hour2)
                