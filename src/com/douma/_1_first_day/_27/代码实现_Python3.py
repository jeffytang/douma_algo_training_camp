def removeElement1(self, nums: List[int], val: int) -> int:
        if len(nums) == 0: return 0

        slow = fast = 0
        while fast < len(nums):
            if nums[fast] != val:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1

        return slow

## 优化后，对撞指针
def removeElement(self, nums: List[int], val: int) -> int:
        left, right = 0, len(nums) - 1
        while left <= right:
            if nums[left] == val:
                nums[left] = nums[right]
                right -= 1
            else: left += 1
        return right + 1