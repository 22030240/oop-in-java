print(".......exception handling program...........")


def b():
    print("in function b,now calling function c()")
    c()
    def c():
        print("In function c,now calling function d")
        d()
        def d():
            print("This is D function")
            a=int(input("Enter value A:"))
            b=int(input("Enter value B:"))
            c=a/b
            print(c)
            try:
                d()
            except ZeroDivisionError:
                print("Can not divide by zero ")
                b()
            else:
                print("------unwanted error-----")
                
print(b())
    
        
    