def summaryRanges(self, nums: List[int]) -> List[str]:
    res, i = [], 0
    while i < len(nums):
        low = i
        i += 1
        while i < len(nums) and nums[i] == nums[i - 1] + 1:
            i += 1
        high = i - 1
        temp = str(nums[low])
        if low < high:
            temp += "->"
            temp += str(nums[high])
        res.append(temp)
    return res