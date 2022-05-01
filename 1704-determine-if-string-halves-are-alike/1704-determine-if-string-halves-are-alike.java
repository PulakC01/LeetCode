class Solution {
    public int getVowels(String sentence) {
        int count = 0;
        sentence = sentence.toLowerCase();
        for(int i=0 ; i<sentence.length(); i++) {
         char ch = sentence.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
            count ++;
      }
        return count;
    }
    
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0,n/2);
        String b = s.substring(n/2,n);
        int x = getVowels(a);
        int y = getVowels(b);
        return x==y;
        
    }
}