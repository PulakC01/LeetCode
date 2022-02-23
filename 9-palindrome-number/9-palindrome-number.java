class Solution {
    public boolean isPalindrome(int x) {
        String str  = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()))
            return true;
        else
            return false;

    }
}