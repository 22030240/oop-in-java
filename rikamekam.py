st=input("Enter massage:")
words=st.split(" ") 
print(words)
nword=[]
nword.append(words[::-1])
print(" ".join(nword))