


i = 0
j = 0
while i < 5:
    M = [int(x) for x in input().split()]
    if 1 in M:
        j = M.index(1)
        print(abs(2-i)+abs(2-j))
        break
    i = i+1