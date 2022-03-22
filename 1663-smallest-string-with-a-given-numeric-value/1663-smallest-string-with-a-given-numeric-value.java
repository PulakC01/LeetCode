class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        Arrays.fill(ans, 'a');
        k = k - n;
        while (n > 0 && k > 0) {
            int valToAdd = Math.min(25, k);
            n--;
            ans[n] = (char) (valToAdd + 'a');
            k -= valToAdd;
        }
        return String.valueOf(ans);
    }
}