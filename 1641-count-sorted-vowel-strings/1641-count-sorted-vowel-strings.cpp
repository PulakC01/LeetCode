class Solution {
public:
    int countVowelStrings(int n) {
        vector<int> ans(5, 1);
        for (int i = 1; i < n; i++)
          for (int j = 3; j >= 0; j--)
              ans[j] += ans[j + 1];
        return accumulate(ans.begin(), ans.end(), 0);
    }
};