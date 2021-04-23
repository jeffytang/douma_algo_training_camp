def candy(self, ratings: List[int]) -> int:
    n = len(ratings)
    left2right = [1] * n
    for i in range(len(ratings)):
        if i != 0 and ratings[i] > ratings[i - 1]:
            left2right[i] = left2right[i - 1] + 1

    ans = right = 0
    for i in range(n - 1, -1, -1):
        if i != n - 1 and ratings[i] > ratings[i + 1]:
            right += 1
        else:
            right = 1
        ans += max(left2right[i], right)

    return ans