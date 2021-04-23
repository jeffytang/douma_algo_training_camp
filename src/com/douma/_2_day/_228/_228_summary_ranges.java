package com.douma._2_day._228;

import java.util.ArrayList;
import java.util.List;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _228_summary_ranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int low = i;
            i++;
            // 找到非连续的点
            while (i < nums.length && nums[i] - nums[i - 1] == 1) i++;

            int high = i - 1;
            StringBuilder sb = new StringBuilder(Integer.toString(nums[low]));
            if (low < high) {
                sb.append("->");
                sb.append(nums[high]);
            }
            res.add(sb.toString());
        }

        return res;
    }
}
