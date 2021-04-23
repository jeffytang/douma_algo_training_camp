package com.douma._2_day._189;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _189_rotate_array {
    // 方案三：数组旋转
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
    // 方案二：环状替换
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = 0;
        for (int start = 0; count < n; start++) {
            int curr = start;
            int prev = nums[start];
            // 循环替换
            do {
                int next = (curr + k) % n;
                int tmp = nums[next];
                nums[next] = prev;
                prev = tmp;

                curr = next;
                count++;
            } while (start != curr);
        }
    }

    // 方案一：使用额外数组
    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] newArr = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int index = (i + k) % n;
            newArr[index] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}
