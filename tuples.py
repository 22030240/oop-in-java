# tuple are the list of multiple element store in one single variable and it is closed in () bracket. tuple are not change they are fix 
# list are changable .
tup=(1,2,3,4,5,"Akshay","DAnge")
print(type(tup),tup)
tuple=(2)     # compilar is confuse || if u press , after element then they does not confuse is tuple or not.
print(type(tuple))

tuple2=(4,)# does not confuse
print(type(tuple2),tuple2)

if 7 in tup:
    print("yes, 3 is present in tup")
else:
    print("sorry,elment is not present in tup")
    
# slicing

tup2=print(tup[1:3])
print(tup[-3])# attomaticaly len(tup)-(-3)

# operation of tuple 

countries=("india","pakistan","italy","England","spain")
tup3=list(countries)# convert tuple to list because tuple are unchangeble.

tup3.append("param")# add at last.
print(tup3)

tup3.pop(2) # remove the element form the list
print(tup3)
tup3[3]="jhscj"# { change the value of the list element index.}
tup3[4]="fjhj"# same 
print(tup3)

print(countries)

# count // is for count the element 
tuple1=(0,2,3,2,42,1,2,2,2,5,2)
res=tuple1.count(2)
print("count of 2 in tuple is:", res)
if 7 in tuple1:
    r=tuple1.count(7)
else:
    print("sorry element not present in this tuple :")

# index() //find out the index of element .
res=tuple1.index(3)
print("index of 3 is:",{res})

# length

print(len(tuple1))

# change karu sakto jevha  aapn tyala list madhe convert karu
# {list()}


