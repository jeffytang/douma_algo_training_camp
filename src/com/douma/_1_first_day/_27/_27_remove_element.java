package com.douma._1_first_day._27;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _27_remove_element {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // 遇到要删除的元素，我们使用数组最后一个元素来替换这个元素
            // 替换后的数字有可能也是要删除的元素，那就接着判断
            // 但是至少，我们从数组的最后删除了一个元素
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return right + 1;
    }
    public int removeElement1(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
