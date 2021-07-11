n=int(input())


count=0

for i in range (n+1):
    for k in range (60):
        for g in range (60):
           if '3' in str(i) + str(k) + str(g):
               count+=1

print(count)
