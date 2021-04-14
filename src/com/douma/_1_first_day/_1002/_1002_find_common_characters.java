package com.douma._1_first_day._1002;

import java.util.ArrayList;
import java.util.List;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _1002_find_common_characters {
    // 时间复杂度：O(m*n)，m 表示数组的长度，n 表示每个字符串的平均长度
    public List<String> commonChars(String[] A) {
        // 用于存储每个字符在所有字符串中出现的最小次数
        int[] minfreq = new int[26];

        // 计算第一个单词中每个字符出现的次数
        for (char c : A[0].toCharArray()) {
            minfreq[c - 'a']++;
        }

        // 计算每个字符出现的最小次数
        for (int i = 1; i < A.length; i++) {
            int[] freq = new int[26];
            for (char c : A[i].toCharArray()) {
                freq[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minfreq[j] = Math.min(minfreq[j], freq[j]);
            }
        }

        // 将字符出现最小次数大于 0 的字符输出到结果中
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minfreq[i]; j++) {
                ans.add(String.valueOf((char)i + 'a'));
            }
        }
        return ans;
    }
}
