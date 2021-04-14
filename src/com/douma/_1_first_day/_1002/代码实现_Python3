def commonChars(self, A: List[str]) -> List[str]:
        minfreq = [0] * 26
        for c in A[0]: minfreq[ord(c) - ord('a')] += 1
        for i in range(1, len(A)):
            freq = [0] * 26
            for c in A[i]:
                freq[ord(c) - ord("a")] += 1
            for j in range(26):
                minfreq[j] = min(minfreq[j], freq[j])

        ans = list()
        for i in range(26):
            ans.extend([chr(i + ord("a"))] * minfreq[i])
        return ans;