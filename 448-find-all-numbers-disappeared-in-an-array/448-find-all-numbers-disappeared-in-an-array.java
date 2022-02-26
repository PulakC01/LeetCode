class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        for(int i=1;i<n+1;i++) {
            if(!check(nums,i))
                ans.add(i);
        }
        return ans;
    }
     public static boolean check(int[] arr, int toCheckValue) {
        int res = Arrays.binarySearch(arr, toCheckValue);
        boolean test = res > -1 ? true : false;
        return test;
    }
}