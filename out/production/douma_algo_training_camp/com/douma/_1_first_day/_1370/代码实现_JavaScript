var sortString = function(s) {
    const counts = new Array(26).fill(0);
    for (let c of s) {
        counts[c.charCodeAt() - 'a'.charCodeAt()]++;
    }

    let res = '';
    while (res.length < s.length) {
        for (let i = 0; i < 26; i++) {
            if (counts[i]) {
                res += String.fromCharCode(i + 'a'.charCodeAt());
                counts[i]--;
            }
        }

        for (let i = 25; i >= 0; i--) {
            if (counts[i]) {
                res += String.fromCharCode(i + 'a'.charCodeAt());
                counts[i]--;
            }
        }
    }

    return res;
};