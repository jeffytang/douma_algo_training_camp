package com.douma._2_day._605;

/**
 * @官方网站 : https://douma.ke.qq.com
 * @微信公众号 : 抖码课堂
 * @官方微信号 : bigdatatang01
 * @作者 : 老汤
 */
public class _605_can_place_flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        // 当所有花坛遍历完或者花种完了，则停止循环
        while (i < flowerbed.length && n > 0) {
            if (flowerbed[i] == 1) {
                // 如果当前花坛已经种花，那么至少需要到 i + 2 的地方才能种花
                i += 2;
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                // i 没有种花，且是最后一个花坛
                // i 和 i + 1 的位置都没有种花
                // 那么 i 处肯定可以种植一朵花
                n--;
                // 至此，至少需要到 i + 2 的地方才能种花
                i += 2;
            } else {
                // i 处没有种花，但是 i + 1 处种花了
                // 那么这个时候，至少需要到 i + 3 的地方才能种花
                i += 3;
            }
        }

        return n <= 0;
    }
}
