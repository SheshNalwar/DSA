arr= [2,8,7,6,4]
max=arr[0]
sec=0
for i in arr:
    if i>max:
        sec=max
        max=i
    elif i>sec and i!=max:
        sec=i

print(sec)