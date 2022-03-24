class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        vector<bool> check(nums.size(),false);
        for(int i : nums) {
            if(check[i]==false) {
                check[i] = true;
            }
            else {
                ans.push_back(i);
            }
        }
       return ans; 
    }
};