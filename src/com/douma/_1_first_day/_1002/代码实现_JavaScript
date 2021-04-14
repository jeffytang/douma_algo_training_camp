var commonChars = function(A) {
    let minfreq = new Array(26).fill(0);
    for (let i = 0; i < A[0].length; i++) minfreq[A[0].charCodeAt(i) - 97]++;

    for (let j = 1; j < A.length; j++) {

        let freq = new Array(26).fill(0);
        for (let i = 0; i < A[j].length; i++) freq[A[j].charCodeAt(i) - 97]++;
        for (let i = 0; i < 26; i++) {
            minfreq[i] = Math.min(minfreq[i], freq[i]);
        }

    }

    let res = [];
    for (let i = 0; i < 26; i++) {
        for (let j = 0; j < minfreq[i]; j++) {
            res.push(String.fromCharCode(i + 97));
        }
    }

    return res;
};