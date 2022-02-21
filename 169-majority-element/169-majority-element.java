class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i : nums) {
            if(!m.containsKey(i)) {
                m.put(i,1);
            }
            else {
                int temp = m.get(i);
                temp++;
                m.replace(i,temp);
            }
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()) {
            if(entry.getValue()> n/2)
                return entry.getKey();
        }
        return -1; 
    }
}