class Solution {
    public String getSmallestString(int n, int k) {
        char[] answer = new char[n];
        Arrays.fill(answer, 'a');
        k = k - n;
        while (n > 0 && k > 0) {
            int valToAdd = Math.min(25, k);
            n--;
            answer[n] = (char) (valToAdd + 'a');
            k -= valToAdd;
        }
        return String.valueOf(answer);
    }
}