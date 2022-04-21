class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int space = 0;
        boolean seen = false;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0)
                space++;
            else {
                if(seen && space<k)
                    return false;
                space=0;
                seen=true;
            }
        }
        return true;
    }
}