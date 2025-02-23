arr= [1,2,3,4,5]

for i in range(len(arr)-1):
    if arr[i]<arr[i+1]:
        pass
    else:
        print(False)
        break
    
print(True)