def moveZeroes1(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        slow = fast = 0
        while fast < len(nums):
            if nums[fast] != 0:
                if slow != fast:
                    nums[slow], nums[fast] = nums[fast], nums[slow]
                slow += 1
            fast += 1

## 优化，直接赋值代替交换
def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        slow = fast = 0
        while fast < len(nums):
            if nums[fast] != 0:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        for i in range(slow, len(nums)): nums[i] = 0