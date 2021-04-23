var summaryRanges = function(nums) {
    const res = []
    let i = 0
    while (i < nums.length) {
        const low = i
        i++
        while (i < nums.length && nums[i] == nums[i - 1] + 1) i++
        const high = i - 1
        const temp = ['' + nums[low]]
        if (low < high) {
            temp.push('->')
            temp.push('' + nums[high])
        }
        res.push(temp.join(''))
    }
    return res
};