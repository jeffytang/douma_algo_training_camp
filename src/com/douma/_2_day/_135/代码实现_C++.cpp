public:
    int candy(vector<int>& ratings) {
        int n = ratings.size();
        vector<int> left2right(n, 1);

        for (int i = 0; i < n; i++) {
            if (i != 0 && ratings[i] > ratings[i - 1]) {
                left2right[i] = left2right[i - 1] + 1;
            }
        }

        int sum = 0;
        int right = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i != n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            sum += max(left2right[i], right);
        }

        return sum;
    }