class Solution {
    public char findTheDifference(String s, String t) {        
        int n = s.length();
        int scount=0;
        int tcount=0;
        for(int i=0;i<n;i++) {
            scount+=s.charAt(i);
            tcount+=t.charAt(i);
        }
        tcount+=t.charAt(t.length()-1);
        
        char ans= (char)(tcount-scount);
        return ans;
    }
}