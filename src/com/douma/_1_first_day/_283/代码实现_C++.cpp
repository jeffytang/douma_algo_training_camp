public:
    void moveZeroes1(vector<int>& nums) {
            int slow = 0, fast = 0;
            while (fast < nums.size()) {
                if (nums[fast]) {
                    if (slow != fast) {
                        swap(nums[slow], nums[fast]);
                    }
                    slow++;
                }
                fast++;
            }
        }

    // 优化，直接赋值代替交换
    void moveZeroes(vector<int>& nums) {
            // slow 指针：指向数组前面最后非零元素的下一个位置
            // fast 指针：指向当前需要判断处理的元素
            int slow = 0, fast = 0;
            while (fast < nums.size()) {
                // 如果当前元素非零的话，那么将它和 slow 指针交换
                if (nums[fast]) {
                    nums[slow] = nums[fast];
                    slow++;
                }
                fast++;
            }
            for (int i = slow; i < nums.size(); i++) nums[i] = 0;
        }