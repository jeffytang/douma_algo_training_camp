def rotate (self, nums: List[int], k: int) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    n = len(nums)
    k = k % n;
    newArr = [0] * n
    for i in range(n):
        newArr[(i + k) % n] = nums[i]
    nums[:] = newArr

##  方案二：环状替换
def rotate (self, nums: List[int], k: int) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    n = len(nums)
    k = k % n
    start = count = 0
    while count < n:
        current = start
        prev = nums[start]
        while True:
            next = (current + k) % n
            nums[next], prev = prev, nums[next]
            current = next
            count += 1
            if start == current: break
        start += 1

## 方案三：数组旋转
def reverse(self, nums: List[int], start: int, end: int) -> None:
    while start < end:
        nums[start], nums[end] = nums[end], nums[start]
        start, end = start + 1, end - 1

def rotate(self, nums: List[int], k: int) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    n = len(nums)
    k = k % n
    self.reverse(nums, 0, n - 1)
    self.reverse(nums, 0, k - 1)
    self.reverse(nums, k, n - 1)