var findDuplicates1 = function(nums) {
    const res = []; 
    for (let i = 0; i < nums.length; i++) {
        const index = Math.abs(nums[i]) - 1;
        if (nums[index] < 0) res.push(Math.abs(nums[i]));
        nums[index] = -nums[index];
    }
    return res;
};

// 第二种方法代码实现
var findDuplicates = function(nums) {
    const n = nums.length
    for (const num of nums) nums[(num - 1) % n] += n

    const res = [];
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] > 2 * n) res.push(i + 1)
    }
    return res;
};