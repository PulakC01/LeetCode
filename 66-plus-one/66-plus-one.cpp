class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();
        for(int i=n-1; i>=0; i--) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        vector<int> all9s(n+1);
        all9s[0] = 1;

        return all9s;
    }
};