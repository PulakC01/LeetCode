class Solution {
public:
    int countOdds(int low, int high) {
        bool first = low%2==0 ? true : false;
        bool last = high%2==0 ? true : false;
        int ans = 0;
        if(first && last)
            ans = (high-low)/2;
        else if(!first && !last)
            ans = (high-low)/2 + 1;
        else
            ans = (high-low+1)/2;
            
        return ans;
    }
};