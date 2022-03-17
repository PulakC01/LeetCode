class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        int n = arr.length;
        String ans = "";
        for(int i=n-1;i>=0;i--) {
            if(i==0)
                ans = ans + arr[i];
            else 
                ans = ans + arr[i]+ " ";
        }
        return ans;
    }
}