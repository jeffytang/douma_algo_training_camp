def findMissingRanges(self, nums: List[int], lower: int, upper: int) -> List[str]:
    res = []
    pre = lower - 1
    nums.append(upper + 1)
    for num in nums:
        diff = num - pre
        if diff == 2: res.append(str(pre + 1))
        elif diff > 2: res.append(str(pre + 1) + "->" + str(num - 1))
        pre = num
    return res