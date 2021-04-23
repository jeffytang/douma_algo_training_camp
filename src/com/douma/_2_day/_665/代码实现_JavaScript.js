var checkPossibility = function(nums) {
    let cnt = 0
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] < nums[i - 1]) {
            cnt++
            if (cnt > 1) return false
            if (i - 2 >= 0 && nums[i] < nums[i - 2]) {
                nums[i] = nums[i - 1]
            } else {
                nums[i - 1] = nums[i]
            }
        }
    }
    return true;
};