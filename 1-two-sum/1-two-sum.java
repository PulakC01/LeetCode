class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int l = nums.length;
        for(int i=0;i<l-1;i++) {
            for(int j=i+1;j<l;j++) {
                if(nums[i]+nums[j]==target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
        
    }
}

