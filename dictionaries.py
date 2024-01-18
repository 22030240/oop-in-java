# dictionaries-> is ordered collection of data type.they store multiple item in a single variable{ }

dic={
    "akshay":"Human being ",
    "spoon":"object",
    "dange":"sirname of akshay"
    }
print(dic["dange"])
print(type(dic)) #-> type 

dic2={
    1:"Akshay",
    2:"ajay",
    3:"gopal",
    4:"bebi"
}
print(dic2[3])

print(dic2.get(4))  # without error

print(dic2.keys())# keys element are return left hand side:
print(dic2.values())# Right hand side values are return.

for ket in dic2.values():
    
    print(ket)
    
    
# method 
# update()

ep={121:45,123:46,124:67}
ep2={345:48,787:454}
ep.update(ep2)
print(ep)
# clear

ep2.clear()
print(ep2)

#pop()
ep.pop(121)
print(ep)

#pop item 

ep.popitem()# pop the last element.
print(ep)

# del 


