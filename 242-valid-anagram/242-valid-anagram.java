class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        int n = s.length();
        int[] counts = new int[26];
        for (int i = 0; i < n; i++) { 
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++)
            if (counts[i]!=0) 
                return false;
        return true;
        
    }
}