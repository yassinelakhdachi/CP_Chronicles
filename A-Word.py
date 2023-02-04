s= input()
y=len(s)
if 1<=y<=100:
    def string_test(s):
        d={"UPPER_CASE":0, "LOWER_CASE":0}
        for c in s:
            if c.isupper():
                d["UPPER_CASE"]+=1
            elif c.islower():
                d["LOWER_CASE"]+=1
            else:
                pass
 
        x = d["UPPER_CASE"]
        y = d["LOWER_CASE"]
        if x>y:
            print(s.upper())
        elif y>x:
            print(s.lower())
        elif x==y:
            print(s.lower())
 
 
    string_test(s)