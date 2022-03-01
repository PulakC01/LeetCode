class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> ans(n+1);
        for(int i=0;i<n+1;i++) {
            ans[i] = getCount(i);
        }
        return ans;
    }
    int getCount(int n) {
        int rem, count = 0;
        while(n!=0) {
            rem = n%2;
            n/=2;
            if(rem==1)
                count+=1;
        }
        return count;
    }
};