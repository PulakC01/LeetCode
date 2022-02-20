class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            int count = 1;
            ArrayList<Character> arr = new ArrayList<>();
            arr.add(s.charAt(i));
            for(int j=i+1;j<n;j++) {
                if(!arr.contains(s.charAt(j))) {
                    arr.add(s.charAt(j));
                    count++;
                }
                else {break;}
            }
            if (count > max)
                max = count;
        }
        return max;
    }
}