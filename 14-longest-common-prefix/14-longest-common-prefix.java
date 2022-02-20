class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l = Integer.MAX_VALUE;
        String prefix = "";
        
        for(String s: strs){
            if (s.length() < l){
                l = s.length();
                prefix = s;
            }
        }
        
        for(String str: strs){
            while(str.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
                
        return prefix;
    }
}