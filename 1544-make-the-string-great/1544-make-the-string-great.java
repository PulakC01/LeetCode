class Solution {
    public String makeGood(String s) {
        char result[] = new char[s.length()], idx = 0;
        for (char c : s.toCharArray())
            if (idx == 0 || Math.abs(c - result[idx - 1]) != 32) {
                result[idx] = c;
                idx++;
            }
            else 
                idx--;
        return new String(result, 0, idx);
    }
}