class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> ans(candies.size(),false);
        for(int i=0;i<candies.size();i++) {
            int temp = candies[i];
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= *max_element(candies.begin(), candies.end()))
                ans[i] = true;
            candies[i] = temp;
        }
        return ans;
    }
};