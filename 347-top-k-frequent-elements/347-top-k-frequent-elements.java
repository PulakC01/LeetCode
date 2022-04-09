class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i : nums) {
            Integer count = m.get(i);
            if (count == null)
                m.put(i,1);
            else
                m.put(i, count + 1); 
        }
        int x = 0;
        m.entrySet().stream().sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
            .forEach(z -> l.add(z.getKey()));
        
        int ans[] = new int[k];
        for(int i=0;i<k;i++) 
            ans[i] = l.get(i);
        return ans;
    }
}