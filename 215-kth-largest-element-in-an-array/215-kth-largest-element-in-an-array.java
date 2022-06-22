class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        if(k>n)
            return -1;
        
        Arrays.sort(nums);
        return nums[n-k];
    }
}