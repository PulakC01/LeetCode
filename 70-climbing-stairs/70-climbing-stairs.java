class Solution {
    Map<Integer,Integer> m = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        return getSteps(n);
    }
    
   public int getSteps(int n) {
        int ans = 0;
        if(m.containsKey(n))
            return m.get(n);

        if(n==1)
            return 1;
        if(n==2) 
            return 2;

        ans = (getSteps(n-1) + getSteps(n-2));
        m.put(n,ans);
        return ans;
    }
}