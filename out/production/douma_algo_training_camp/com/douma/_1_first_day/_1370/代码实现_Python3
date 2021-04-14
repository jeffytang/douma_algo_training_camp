def sortString(self, s: str) -> str:
        counts = [0] * 26
        for c in s:
            counts[ord(c) - ord('a')] += 1

        res = list()
        while len(res) < len(s):
            for i in range(26):
                if counts[i]:
                    res.append(chr(i + ord('a')))
                    counts[i] -= 1
            for i in range(25, -1, -1):
                if counts[i]:
                    res.append(chr(i + ord('a')))
                    counts[i] -= 1
        return "".join(res)