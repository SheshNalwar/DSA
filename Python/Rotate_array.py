nums = [-1,-100,3,99]
k=5
if (k>len(nums)-1):
    k=k%len(nums)
nums=nums[-k:]+nums[:-k]
print(nums)