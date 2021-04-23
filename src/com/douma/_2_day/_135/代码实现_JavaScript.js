var candy = function(ratings) {
    const n = ratings.length
    const left2right = new Array(n).fill(1)

    for (let i = 0; i < n; i++) {
        if (i != 0 && ratings[i] > ratings[i - 1]) {
            left2right[i] = left2right[i - 1] + 1
        }
    }

    let sum = right = 0;
    for (let i = n - 1; i >= 0; i--) {
        if (i != n - 1 && ratings[i] > ratings[i + 1]) {
            right++
        } else {
            right = 1
        }
        sum += Math.max(left2right[i], right)
    }

    return sum
};