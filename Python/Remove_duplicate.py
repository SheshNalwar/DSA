arr= [1, 1, 2, 2, 2, 3, 3]
arrr=[]
for i in arr:
    if i not in arrr:
        arrr.append(i)
print(arrr)


#Optimal

i = 0
for j in range(1, len(arr)):
    if arr[i] != arr[j]:
        i += 1
        arr[i] = arr[j]
print( i + 1)