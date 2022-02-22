class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans = 0;
        for(int i=0;i<n;i++) {
            int temp = columnTitle.charAt(i) - 'A' + 1;
            ans = ans*26 + temp;
        }
        return ans;
    }
}