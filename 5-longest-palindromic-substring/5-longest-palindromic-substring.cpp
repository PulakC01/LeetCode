class Solution {
public:
    string longestPalindrome(string s) {
        if(s.size() < 2)
            return s;
        int max_len = 0;
        int start_idx = 0;
        int i = 0;
        while(i < s.size()) {
            int right = i; 
            int left = i;
            //find the middle of a palindrome
            while(right < s.size()-1 && s[right] == s[right+1]) 
                right++;
            
            i = right + 1;
            //expand from the middle out
            while(right < s.size()-1 && left > 0 && s[right + 1] == s[left - 1]) {
                right++;
                left--;
            }
            
            int new_len = right - left + 1;
            if(new_len > max_len) {
                start_idx = left;
                max_len = new_len;
            }
        }
        return s.substr(start_idx, max_len);
    }
};