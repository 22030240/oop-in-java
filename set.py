# set is collection of well define object .> no repeded varible.  {  },/ unorder collection / unchangeble / do not doublicate 

s={2,4,2,3,2,32,3,2}
print(s)

info={"india", 2.3,4,5,6,2,"dange"}
print(info)

akshay=set()
print(type(akshay))

ajay={}            # empty carly brackt goes to dict 
print(type(ajay))

for value in info:
    print(value," ")

s1={2,4,6,7}
s2={4,6,9,4,5,5,44,4,33,3,3,4,3,9,5}
print(s1.union(s2))
s1.update(s2)
print(s1,s2)
print(s1.intersection(s2))
s1.intersection_update(s2)
print(s1)
print(s1.difference(s2))
kaka=s1.symmetric_difference(s2)
print(kaka)
#issuperset
#issubset
#

sy={"ak","dhj","jhdjh"}
sy.add("jhj")
print(sy)
#remove -> when element is not found in a set then create error
sy.remove("ak")
print(sy)

#discard-> when element is not found in a set then does not create error
sy.discard("dhj")
print(sy)
# pop-> random element is pop out
ii=sy.pop()
print(sy)
print(ii)
#del-> del is keyword is use to  delet the set


#clear->use to delet all element of set
sy.clear()
print(sy)

dd={1,3,4,6,7,3,6,3,53,2,123,45}
if 124 in dd:
    print("yes present")
else:
    print("not present ")

