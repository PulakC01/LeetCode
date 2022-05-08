class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int l = part.length();
        int idx = str.indexOf(part);
        while(idx!=-1) {
            str.delete(idx, idx+l);
            idx = str.indexOf(part);
        }
        return str.toString();
    }
}