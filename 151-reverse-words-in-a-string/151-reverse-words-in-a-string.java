class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        String ans = "";
        for(int i=arr.length-1;i>=0;i--) {
            if(i==0)
                ans = ans + arr[i];
            else 
                ans = ans + arr[i]+ " ";
        }
        return ans;
    }
}