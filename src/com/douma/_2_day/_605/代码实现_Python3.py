def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
    i, l = 0, len(flowerbed)
    while i < l and n > 0:
        if flowerbed[i] == 1:
            i += 2
        elif i == l - 1 or flowerbed[i + 1] == 0:
            n -= 1
            i += 2
        else:
            i += 3
    return n <= 0