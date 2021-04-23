def checkPossibility(self, nums: List[int]) -> bool:
    cnt = 0
    for i in range(1, len(nums)):
        if (nums[i] < nums[i - 1]):
            cnt += 1
            if cnt > 1: return False
            if i - 2 >= 0 and nums[i] < nums[i - 2]:
                nums[i] = nums[i - 1]
            else:
                nums[i - 1] = nums[i]
    return True