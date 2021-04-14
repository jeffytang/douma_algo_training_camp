public:
    vector<string> commonChars(vector<string>& A) {
        vector<int> minfreq(26);
        for (char c : A[0]) minfreq[c - 'a']++;

        vector<int> freq(26);
        for (int i = 1; i < A.size(); i++) {
            fill(freq.begin(), freq.end(), 0);
            for (char c : A[i]) freq[c - 'a']++;
            for (int j = 0; j < 26; j++) {
                minfreq[j] = min(minfreq[j], freq[j]);
            }
        }

        vector<string> ans;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minfreq[i]; j++) {
                ans.emplace_back(1, i + 'a');
            }
        }

        return ans;
    }