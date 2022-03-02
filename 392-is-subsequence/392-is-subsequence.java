class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        String[] substrings = s.split("");
        for(String c : substrings) {
            if(t.indexOf(c, index+1)==-1)
                return false;
            else {
                if(t.indexOf(c, index+1)<index)
                    return false;
                index = t.indexOf(c, index+1);
            }
        }
        return true;
    }
}