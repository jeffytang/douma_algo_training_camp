def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for x in nums:
            index = (x - 1) % n
            nums[index] += n
        return [i + 1 for i, num in enumerate(nums) if num <= n]