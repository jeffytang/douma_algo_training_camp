public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int i = 0;
        int len = flowerbed.size();
        while (i < len && n > 0) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == len - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else {
                i += 3;
            }
        }
        return n <= 0;
    }