class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        String prefix = "";
        for(int i=0;i<minLen;i++) {
            char test = strs[0].charAt(i);
            boolean common = true;
            for(int j=0;j<n;j++) {
                if(strs[j].charAt(i)!=test) {
                    common = false;
                    break;
                }
            }
            if(common) {
                prefix = prefix + String.valueOf(test);
            }
            else 
                break;
        }
        return prefix;
    }
}