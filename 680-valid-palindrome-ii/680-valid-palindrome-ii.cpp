class Solution {
public:
    bool validPalindrome(string s) {
        for (int i = 0, j = s.size() - 1; i < j; i++, j--)
            if (s[i] != s[j]) 
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
        return true;
    }
    bool isValid(string s, int l, int r) {
        for (int i = l, j = r; i < j; i++, j--)
            if (s[i] != s[j])
                return false;
        return true;
    }
};