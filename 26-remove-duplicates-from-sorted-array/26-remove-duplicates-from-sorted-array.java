class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0 ; 
        for(int n:nums)
            if(n>nums[current]) {
                current++;
                nums[current] = n;
            }
        return current+1;
    }
}