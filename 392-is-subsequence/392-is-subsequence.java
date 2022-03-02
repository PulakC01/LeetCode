class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
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