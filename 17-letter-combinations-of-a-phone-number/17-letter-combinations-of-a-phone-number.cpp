class Solution {
    private:
        int len;
        vector<string> keypad {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
        void makeCombo(string& digits, int pos, string temp, vector<string>& v) {
            if(pos == len)
                return ;
            string s = keypad[digits[pos]-'2'];
            for(int i = 0; i<s.length(); ++i) {
                if(pos == len-1)
                    v.push_back(temp+s[i]);
                else 
                    makeCombo(digits, pos+1, temp+s[i], v);
            }
        }
    
    public:
        vector<string> letterCombinations(string digits) {
            len = digits.length();
            vector<string> v;
            makeCombo(digits, 0, "", v);
            return v;
        }
};