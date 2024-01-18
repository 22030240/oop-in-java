email=input("ENTER EMAIL:")
k=0   
j=0 
d=1                                                 #akshaydange2003@gmail.com
if len(email)>=6:
    if email[0].isalpha():
        if ("@" in email) and (email.count("@")==1):
            if (email[-4]==".") or (email[-3]=="."):      # 22030240@ycce.in
                for i in email:
                    if i==i.isspace():
                        k=1
                    elif i==i.isalpha():
                        if i==i.upper():
                            j=1
                    elif i.isdigit():
                        continue
                    elif i=="_" or i=="." or i=="@":
                        continue
                    else:
                        d=1
                        
                
                if k==1 or j==1 or d==1 :
                        print("wrong email:")
                else:
                        print("right  Email")    
                    
            else:
                print("Wrong Email 4.")              #len(email)-email[-4]  .com
                                                     # len(email)-email[-3]   .in
        else:
            print("Wrong Email 3.")
    else:
        print("Wrong Email 2.")
else:
    print("Wrong Email 1.")
    
