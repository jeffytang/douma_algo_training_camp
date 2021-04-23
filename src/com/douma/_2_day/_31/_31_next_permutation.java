package com.douma._2_day._31;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _31_next_permutation {
    public void nextPermutation(int[] nums) {
        // 1. 找到尽量靠右的【较小数】
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        // 2. 如果找到了【较小数】
        if (i >= 0) {
            // 找到尽量靠右的【较大数】
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) j--;

            // 交换【较小数】和【较大数】
            swap(nums, i, j);
        }

        // 3. 反转【较小数】 i 之后的所有元素
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
