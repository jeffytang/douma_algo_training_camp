package com.douma._2_day._135;

import java.util.Arrays;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _135_candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left2right = new int[n];
        Arrays.fill(left2right, 1);

        for (int i = 0; i < n; i++) {
            if (i != 0 && ratings[i] > ratings[i - 1]) {
                left2right[i] = left2right[i - 1] + 1;
            }
        }

        int sum = 0;
        int right = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i != n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            sum += Math.max(left2right[i], right);
        }

        return sum;
    }
    // 两个数组 + 两次遍历 O(n)
    public int candy2(int[] ratings) {
        int n = ratings.length;
        int[] left2right = new int[n];
        Arrays.fill(left2right, 1);

        int[] right2left = new int[n];
        Arrays.fill(right2left, 1);

        for (int i = 0; i < n; i++) {
            if (i != 0 && ratings[i] > ratings[i - 1]) {
                left2right[i] = left2right[i - 1] + 1;
            }
        }

        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i != n - 1 && ratings[i] > ratings[i + 1]) {
                right2left[i] = right2left[i + 1] + 1;
            }
            sum += Math.max(left2right[i], right2left[i]);
        }

        return sum;
    }
    // 直接模拟，暴力解法 O(n^2)
    public int candy1(int[] ratings) {
        int n = ratings.length;

        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            for (int i = 0; i < n; i++) {
                if (i != n - 1 && ratings[i] > ratings[i + 1]
                        && candies[i] <= candies[i + 1]) {
                    candies[i] = candies[i + 1] + 1;
                    hasChanged = true;
                }
                if (i != 0 && ratings[i] > ratings[i - 1]
                        && candies[i] <= candies[i - 1]) {
                    candies[i] = candies[i - 1] + 1;
                    hasChanged = true;
                }
            }
        }

        int sum = 0;
        for (int candy : candies) sum += candy;
        return sum;
    }
}
