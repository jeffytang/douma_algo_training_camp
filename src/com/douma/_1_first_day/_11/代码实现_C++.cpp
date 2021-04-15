public:
    int maxArea(vector<int>& height) {
        int left = 0, right = height.size() - 1;
        int ans = 0;
        while (left < right) {
            // 面积取决于最短的那个柱子
            int area = min(height[left], height[right]) * (right - left);
            ans = max(ans, area);
            // 在保证长度最长的前提下，如果高度越高，那么面积越大
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }