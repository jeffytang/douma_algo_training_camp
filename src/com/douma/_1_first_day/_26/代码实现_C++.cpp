public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0) return 0;
        int slow = 0;
        int fast = 1;
        while (fast < nums.size()) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }