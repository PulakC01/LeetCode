class Solution {
    public int myAtoi(String s) {
        String ans = "";
        String str = s.replaceAll("^\\s+", "");
        boolean pos = true;
        int n = str.length();
        for(int i=0;i<n;i++) {
            if(str.charAt(i)=='-' && i==0) {
                pos = false;
                continue;
            }
            if(str.charAt(i)=='+' && i==0) {
                pos = true;
                continue;
            }
            if(!Character.isDigit(str.charAt(i)))
                break;
            else
                ans = ans + String.valueOf(str.charAt(i));
            if(Long.parseLong(ans) > Integer.MAX_VALUE) {
                if(pos)
                    ans = String.valueOf(Integer.MAX_VALUE);
                else
                    ans = String.valueOf(Integer.MIN_VALUE);
                return Integer.parseInt(ans);
            }
        }
        if(ans.length()==0)
            return 0;
        if(!pos)
            return (0-Integer.parseInt(ans));
        return Integer.parseInt(ans);
    }
    
}