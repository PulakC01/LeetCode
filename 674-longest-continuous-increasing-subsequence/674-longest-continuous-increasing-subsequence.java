class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1, count = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]>nums[i-1]) {
                count++;
                ans = Math.max(count, ans);
            }
            else 
                count = 1;
        }
        return ans;
    }
}