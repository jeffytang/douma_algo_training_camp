public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();

        vector<int> output(n);
        // 先将每个元素的左边全部元素的乘积存储在 output 中
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // 每个元素的右边所有元素的乘积存储在一个变量中
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            // 对于索引 i，左边的乘积为 output[i]，右边的乘积为 rightProduct
            output[i] = output[i] * rightProduct;
            // 更新右边乘积
            rightProduct = rightProduct * nums[i];
        }

        return output;
    }