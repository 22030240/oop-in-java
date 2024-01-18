namelist=["Akshay","Ajay"]
print("Current list name is-->>",namelist)

new_name=input("Enter new name:\t")
namelist.append(new_name)
print("Updated name list is-->",namelist)

new_name=input("Enter another name with different insertion medhod\n")
namelist.extend(new_name)
print("Updated name list is-->",namelist)

new_name=input("Enter another name with different insertion medhod")
namelist.insert(0,new_name)
print("Updated name list is-->",namelist)
