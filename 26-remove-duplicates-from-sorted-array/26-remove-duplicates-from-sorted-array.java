class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int index=0;
        for(int i=0;i<nums.length;i++) {
            if(!m.containsValue(nums[i])) {
                m.put(index,nums[i]);
                index++;
            }
        }
        for(int i=0;i<index;i++) {
            nums[i] = m.get(i);
        }
        return index;
    }
}