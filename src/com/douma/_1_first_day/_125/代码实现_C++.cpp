public:
    bool isPalindrome(string s) {
        int left = 0;
        int right = s.size() - 1;

        while (left < right) {
            // 忽略左边无效字符
            while (left < right && !isalnum(s[left])) {
                left++;
            }
            // 忽略右边无效字符
            while (left < right && !isalnum(s[right])) {
                right--;
            }

            if (left < right) {
                if (tolower(s[left]) != tolower(s[right])) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }