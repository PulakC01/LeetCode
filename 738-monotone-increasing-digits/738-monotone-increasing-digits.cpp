class Solution {
public:
    int monotoneIncreasingDigits(int n) {
        string s = to_string(n);
        int index = s.size();
        for(int i = s.size() - 1; i>=0 ; i--) {
            if(i-1>= 0 && s[i-1] > s[i]) {
                s[i-1]--;
                index = i;
            }
        }
        while(index < s.size())
            s[index++] = '9';
        
        return stoi(s);
    }
};