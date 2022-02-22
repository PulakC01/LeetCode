class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i=0;i<columnTitle.length();i++) {
            ans = ans*26 + (columnTitle.charAt(i) - 64);
        }
        return ans;
    }
}