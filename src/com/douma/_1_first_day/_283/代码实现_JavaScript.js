var moveZeroes1 = function(nums) {
    let slow = 0, fast = 0;
    while (fast < nums.length) {
        if (nums[fast]) {
            if (slow != fast) {
                [nums[fast], nums[slow]] = [nums[slow], nums[fast]]
            }
            slow++
        }
        fast++
    }
};

// 优化，直接赋值代替交换
var moveZeroes = function(nums) {
    let slow = 0, fast = 0;
    while (fast < nums.length) {
        if (nums[fast]) {
            nums[slow] = nums[fast]
            slow++
        }
        fast++
    }
    for (let i = slow; i < nums.length; i++) nums[i] = 0
};