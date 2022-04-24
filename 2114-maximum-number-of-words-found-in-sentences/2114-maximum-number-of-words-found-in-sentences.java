class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = Integer.MIN_VALUE;
        for(String s : sentences) {
            String arr[] = s.split(" ");
            int l = arr.length;
            ans = Math.max(ans,l);
        }
        return ans;
    }
}