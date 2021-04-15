def findDuplicates(self, nums: List[int]) -> List[int]:
        res = []
        for x in nums:
            index = abs(x) - 1
            if nums[index] < 0: res.append(abs(x))
            else: nums[index] = -nums[index]
        return res;

## 第二种方法代码实现
def findDuplicates(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for x in nums:
            nums[(x - 1) % n] += n
        res = []
        for i in range(n):
            if nums[i] > 2 * n: res.append(i + 1)
        return res;