var isPalindrome = function(s) {
    var left = 0
    var right = s.length - 1
    while (left < right) {
        while (left < right && !isLetterOrDigit(s.charCodeAt(left))) {
            left++
        }

        while (left < right && !isLetterOrDigit(s.charCodeAt(right))) {
            right--
        }

        if (left < right) {
            if (toLowerCase(s.charCodeAt(left)) != toLowerCase(s.charCodeAt(right))) {
                return false
            }
            left++
            right--
        }
    }

    return true
};

var isLetterOrDigit = function(code) {
    if (((code >= 48) && (code <= 57)) // 数字
        || ((code >= 65) && (code <= 90))  // 大写字母
        || ((code >= 97) && (code <= 122))) { // 小写字母
        return true
    } else {
        return false
    }
}

var toLowerCase = function(code) {
    if (code >= 65 && code <= 90) {
        return code + 32
    } else {
        return code
    }
}