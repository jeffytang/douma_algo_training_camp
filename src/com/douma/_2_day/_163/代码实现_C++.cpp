public:
    vector<string> findMissingRanges(vector<int>& nums, int lower, int upper) {
        vector<string> res;
        long pre = (long)(lower - 1);
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] - pre == 2) res.push_back(to_string(pre + 1));
            else if (nums[i] - pre > 2) res.push_back(to_string(pre + 1) + "->" + to_string(nums[i] - 1));

            pre = nums[i];
        }

        if (upper - pre == 1) res.push_back(to_string(pre + 1));
        else if (upper - pre > 1) res.push_back(to_string(pre + 1) + "->" + to_string(upper));

        return res;
    }