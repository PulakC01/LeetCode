class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder str = new StringBuilder(num);
        if(num.length()==k)
            return String.valueOf(0);
        
        for(int i=0;i<k;i++) {
            int max = 0;
            for(int j=0;j<str.length();j++) {
                if(Integer.parseInt(String.valueOf(str.charAt(j)))>=max) {
                    if(j==str.length()-1) {
                        str.deleteCharAt(j);
                        break;
                    }
                    max = Integer.parseInt(String.valueOf(str.charAt(j)));
                }
                else {
                    str.deleteCharAt(j-1);
                    break;
                }
            }
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        str.replace(0, i, "");
        if(str.length()==0)
            return String.valueOf(0);
        return str.toString();
    }
}