input_data=input()

row=int(input_data[1])
col=int(ord(input_data[0]))-int(ord('a'))+1

steps=[(-2,-1),(-2,1),(-1,2),(-1,-2),(1,2),(1,-2),(2,1),(2,-1)]

count=0

for steps in steps:
    next_row=row+steps[0]
    next_col=col+steps[1]

    if next_row>=1 and next_row<=8 and next_col>=1 and next_col<=8:
        count+=1

print(count)
