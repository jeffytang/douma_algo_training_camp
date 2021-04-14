package com.douma._1_first_day._344;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _344_reverse_string {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;

            left++;
            right--;
        }
    }
}
