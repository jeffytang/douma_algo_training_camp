public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> res;

        int i = 0;
        while (i < nums.size()) {
            int low = i;
            i++;

            // 找到非连续的点
            // 使用 nums[i] - nums[i - 1] == 1 会产生整型溢出
            while (i < nums.size() && nums[i] == nums[i - 1] + 1) i++;

            int high= i - 1;
            string sb = to_string(nums[low]);
            if (low < high) {
                sb.append("->");
                sb.append(to_string(nums[high]));
            }

            res.push_back(move(sb));
        }

        return res;
    }