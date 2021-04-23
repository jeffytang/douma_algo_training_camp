var findMissingRanges = function(nums, lower, upper) {
    const res = []
    let pre = lower - 1
    for (let i = 0; i < nums.length; i++) {
        const diff = nums[i] - pre
        if (diff == 2) res.push('' + (pre + 1))
        else if (diff > 2) res.push((pre + 1) + '->' + (nums[i] - 1))

        pre = nums[i]
    }

    if (upper - pre == 1) res.push('' + (pre + 1))
    else if (upper - pre > 1) res.push((pre + 1) + '->' + upper)

    return res
};