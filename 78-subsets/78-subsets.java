class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        for(int i : nums) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : ans) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            ans.addAll(tmp);
        }
        return ans;
    }
}