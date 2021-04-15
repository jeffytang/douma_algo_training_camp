public:
    int removeElement1(vector<int>& nums, int val) {
        if (nums.size() == 0) return 0;
        int slow = 0;
        int fast = 0;
        while (fast < nums.size()) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    // 优化后，对撞指针
    int removeElement(vector<int>& nums, int val) {
            int left = 0;
            int right = nums.size() - 1;
            while (left <= right) {
                // 遇到要删除的元素，我们使用数组最后一个元素来替换这个元素
                // 替换后的数字有可能也是要删除的元素，那就接着判断
                // 但是至少，我们从数组的最后删除了一个元素
                if (nums[left] == val) {
                    nums[left] = nums[right];
                    right--;
                } else { // 否则，一直走
                    left++;
                }
            }
            return right + 1;
        }