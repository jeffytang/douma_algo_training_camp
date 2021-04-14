package com.douma._1_first_day._283;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _283_move_zeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;
        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            if (nums[fast] != 0) {
                // 不加上，性能还更好，说明赋值语句比比较语句执行快
                if (slow != fast) { // 减少交换的次数
                    // 使用直接赋值代替交换
                    nums[slow] = nums[fast];
                }
                slow++;
            }
            fast++;
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        if (nums.length == 0) return;
        int slow = 0;
        int fast = 0;
        while (fast < nums.length){
            if (nums[fast] != 0) {
                if (slow != fast) { // 减少交换的次数
                    // 交换 fast 和 slow 指向的元素
                    int tmp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = tmp;
                }
                slow++;
            }
            fast++;
        }
    }
}
