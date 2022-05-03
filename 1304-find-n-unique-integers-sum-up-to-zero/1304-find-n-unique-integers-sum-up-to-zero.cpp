class Solution {
public:
    vector<int> sumZero(int n) {
        bool even = n%2==0;
        vector<int> ans;
        int range = 0;
        
        range = floor(n/2);
        for(int i = -range; i<=range; i++) {
            if(i==0 && even)
                continue;
            ans.push_back(i);
        }
        return ans;
    }
};