var rotate = function(nums, k) {
    const n = nums.length
    k = k % n;
    const newArr = new Array(n)
    for (let i = 0; i < n; i++) {
        newArr[(i + k) % n] = nums[i]
    }
    for (let i = 0; i < n; i++) {
        nums[i] = newArr[i]
    }
};

// 方案二：环状替换
var rotate = function(nums, k) {
    const n = nums.length
    k = k % n
    let count = 0
    for (let start = 0; count < n; start++) {
        let current = start
        let prev = nums[start]
        do {
            const next = (current + k) % n
            const tmp = nums[next]
            nums[next] = prev
            prev = tmp
            current = next
            count++
        } while (start != current)
    }
};

// 方案三：数组旋转
var rotate = function(nums, k) {
    const n = nums.length
    k = k % n
    reverse(nums, 0, n - 1)
    reverse(nums, 0, k - 1)
    reverse(nums, k, n - 1)
}

var reverse = function(nums, start, end) {
    while (start < end) {
        [nums[start], nums[end]] = [nums[end], nums[start]]
        start++
        end--
    }
}