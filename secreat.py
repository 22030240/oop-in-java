st=input("Enter massage:")
words=st.split(" ")                   # [     ,        ,      ]diffrent diffrent part madhi convert karte
coding=input("1 for coding and 0 for decoding:")
coding=True if (coding=="1") else False   # 1 (coding)    0(decoding)
if(coding):
    nword=[]
    for word in words:
        if(len(word)>=3):
            r1=input("Enter secreat code:")
            r2=input("Enter secreat code:")
            stnew=r1+word[1:]+word[0]+r2   #jhd+word[1:len(word)]+word[0]=pahila element +xjn
            nword.append(stnew)
        else:
            nword.append(word[::-1])
        print(" ".join(nword))
else:
    nword=[]
    for word in words:
        if(len(word)>=3):
            stnew=word[3:-3]          # pahile 4 sudun un lastche 4 sodun ->kshayisagoodboya
            stnew=stnew[-1]+stnew[:-1]  #  a+kshayisagoodboy
            nword.append(stnew)          #akshayisagoodboy
        else:
            nword.append(word[::-1])
        print(" ".join(nword))
            
            
            