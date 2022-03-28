class Solution {
public:
    bool isPowerOfFour(int n) {
        float num = n;
        while(num>1) {
            num = num/4;
        }
        return (num==1);
    }
};