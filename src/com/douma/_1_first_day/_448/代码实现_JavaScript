var findDisappearedNumbers = function(nums) {
    const n = nums.length;
    for (const num of nums) {
        const index = (num - 1) % n;
        nums[index] += n;
    }

    const res = [];
    for (const [i, num] of nums.entries()) {
        if (num <= n) res.push(i + 1)
    }

    return res;
};