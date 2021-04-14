public:
    vector<int> findDuplicates1(vector<int>& nums) {
            vector<int> res;
            for (int i = 0; i < nums.size(); i++) {
                int index = abs(nums[i]) - 1;
                if (nums[index] < 0) res.push_back(abs(nums[i]));
                nums[index] = -nums[index];
            }
            return res;
        }

// 第二种方法代码实现
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int index = (nums[i] - 1) % n;
            nums[index] += n;
        }

        vector<int> res;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] > 2 * n) res.push_back(i + 1);
        }
        return res;
    }