package com.douma._2_day._163;

import java.util.ArrayList;
import java.util.List;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _163_missing_ranges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        long pre = lower - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pre + 2) res.add(String.valueOf(pre + 1));
            else if (nums[i] > pre + 2) {
                res.add((pre + 1) + "->" + (nums[i] - 1));
            }
            pre = nums[i];
        }
        if (upper == pre + 1) res.add(String.valueOf(pre + 1));
        else if (upper > pre + 1) {
            res.add((pre + 1) + "->" + upper);
        }

        return res;
    }
}
