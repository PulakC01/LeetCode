class Solution {
public:
  int longestConsecutive(vector<int>& nums) {
    if(nums.size() == 0) 
      return 0;
    sort(nums.begin(), nums.end());
    int temp = 0,ans = 0;
    for(int i=0;i<nums.size()-1;i++) {
      if(nums[i] == nums[i+1])
        continue;
      if((nums[i+1] - nums[i]) == 1) 
        temp++;
      else 
        temp = 0;
      
      ans = max(ans,temp);
    }
    return ans + 1;
  }
};