package com.douma._1_first_day._80;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _80_remove_duplicates_from_sorted_array_ii {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int slow = 2; // 已经处理区域的最后一个位置的下一个位置
        int fast = 2;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public int removeDuplicates1(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int slow = 1; // 已经处理区域的最后一个位置
        int fast = 2;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow - 1]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
