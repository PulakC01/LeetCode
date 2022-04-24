class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++) {
            ans = Math.max(ans,(sentences[i].split(" ")).length);
        }
        return ans;
    }
}