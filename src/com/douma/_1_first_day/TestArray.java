package com.douma._1_first_day;

import java.util.HashMap;
import java.util.Map;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class TestArray {
    /**
     * 计算输入数组中每个元素出现的次数
     * @param arr
     * @return
     */
    private static Map<Integer, Integer> countArray1(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                countMap.put(num, count + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        return countMap;
    }

    /**
     * 计算输入数组中每个元素出现的次数
     * @param arr 数组每个元素的大小：1 <= arr[i] <= 6
     * @return
     */
    private static int[] countArray2(int[] arr) {
        int[] countMap = new int[6];
        for (int num : arr) {
            // 元素值作为索引下标
            int index = num - 1;
            countMap[index]++;
        }
        return countMap;
    }
}
