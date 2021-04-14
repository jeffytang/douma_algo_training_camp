package com.douma._1_first_day._238;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _238_product_of_array_except_self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // 先将每个元素的左边全部元素的乘积存储在 output 中
        int[] output = new int[n];
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // 每个元素的右边所有元素的乘积存储在一个变量中
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i++) {
            // 对于索引 i，左边的乘积为 output[i]，右边的乘积为 rightProduct
            output[i] = output[i] * rightProduct;
            // 更新右边乘积
            rightProduct = rightProduct * nums[i];
        }

        return output;
    }

    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;

        // leftProducts[i] 表示索引 i 左侧所有元素的乘积
        int[] leftProducts = new int[n];
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // rightProducts[i] 为索引 i 右侧所有元素的乘积
        int[] rightProducts = new int[n];
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = leftProducts[i] * rightProducts[i];
        }

        return output;
    }

    // 暴力解法
    // O(n^2)
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            // 求左边数的乘积
            int leftProduct = 1;
            for (int j = 0; j < i; j++) {
                leftProduct *= nums[j];
            }
            // 求右边数的乘积
            int rightProduct = 1;
            for (int j = i + 1; j < n; j++) {
                rightProduct *= nums[j];
            }
            // 将左边和右边乘积再相乘
            output[i] = leftProduct * rightProduct;
        }

        return output;
    }
}
