class Solution {
public:
    int removePalindromeSub(string s) {
        if(s.size()==0) 
            return 0;
    
        string t = s;
        reverse(t.begin(),t.end());
        return s == t ? 1 : 2;
    }
};