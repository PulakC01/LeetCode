class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++) {
            String s = arr[i];
            char ch = s.charAt(0);
            if("AEIOUaeiou".indexOf(ch) != -1)
                s = s + "ma";
            else
                s = s.substring(1) + Character.toString(ch) + "ma";
            
            s = s + "a".repeat(i+1);
            arr[i] = s;
        }
        return String.join(" ",arr);
    }
}