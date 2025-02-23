arr= [2,8,7,6,4]
max=arr[0]
sec=0
third=0
for i in arr:
    if i>max:
        third=sec
        sec=max
        max=i
    elif i>sec and i!=max:
        third=sec
        sec=i
    if i>third and i!=max and i!=sec:
        third=i
    
print(sec)