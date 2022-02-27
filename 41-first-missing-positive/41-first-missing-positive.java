class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=1, ans;
        while(true) {
            if(!check(nums,i)) {
                ans = i;
                break;
            }
            i+=1;
        }
        return ans;
    }
    public static boolean check(int[] arr, int val) {
        int res = Arrays.binarySearch(arr,val);
        boolean ans = res > -1 ? true : false;
        return ans;
    }
}