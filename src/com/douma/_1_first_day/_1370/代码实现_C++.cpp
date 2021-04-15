public:
    string sortString(string s) {
        vector<int> counts(26);
        for (char &c : s) {
            counts[c - 'a']++;
        }

        string res;
        while (res.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (counts[i]) {
                    res.push_back(i + 'a');
                    counts[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (counts[i]) {
                    res.push_back(i + 'a');
                    counts[i]--;
                }
            }
        }
        return res;
    }