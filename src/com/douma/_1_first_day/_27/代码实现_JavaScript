var removeElement1 = function(nums, val) {
    if (nums.length == 0) return 0

    let slow = 0, fast = 0
    while (fast < nums.length) {
        if (nums[fast] != val) {
            nums[slow] = nums[fast]
            slow++
        }
        fast++
    }

    return slow
};

// 优化后，对撞指针
var removeElement = function(nums, val) {
    let left = 0, right = nums.length - 1
    while (left <= right) {
        if (nums[left] == val) {
            nums[left] = nums[right]
            right--
        } else {
            left++
        }
    }
    return right + 1
}