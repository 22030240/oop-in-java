ques=[["which language was create facebook?","pythone","french","javascript","php","None",4],

["akshay date of birth is?","20/10/1004","20/10/1003","20/10/2003","20/5/2003","None",3],

["tell me father name of akshay","gopal","ramchandra","gajanan","saligram","None",1],

["tell me mother name of akshay ?","manswi","radha","shamili","bebi","None",4],
["tell me how many brother of akshay?","one","Two","Three","Four",1],
["tell me status of akshay?","married","unmarried","lover","majnu",2],
["tell me akshay branch?","Mechanical enginnering","civil engineering","Information Technology","Computer science",3],
["akshay having {%} in 3rd semester ?","9.11","8.14","9.99","9.14",4],
["akshay diploma branch is?","IT","ME","CE","EE",2],
["Akshay brother name is?","ajane","nama","ajay","amit",3],
["have a sister akshay?","yes 2","no ","yes 1","yes 6",2]]

levels=[1000,2000,3000,5000,10000,20000,40000,80000,100000,320000,640000,1280000,10000000000,200000000,3000000]
no=[1,2,3,4,5,6,7,8,9,10,11]

i=0
for i in range(0, len(ques)):
    que=ques[i]
    print(f" {no[i]} .{que[0]} and  question for rs.{levels[i]}")
    print(f"a.{que[1]}   b.{que[2]}    c. {que[3]}    d.{que[4]}")
    replay=int(input("Enter your answer(1-4):  "))
    if(replay==que[-1]):
        print(f"correct answer, you have won rs.{levels[i]}")
        if(i==4):
            money=10000
        elif(i==9):
            money=320000
        elif(i==14):
            money=10000000
    else:
        print("Wrong answer !")
        break
        
print(f"Your take home money is {money}")
            