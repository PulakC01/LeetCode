class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            arr.add(strs[i].length());
        }
        int l = Collections.min(arr);
        String prefix = "";
        for(int i=0;i<l;i++) {
            char test = strs[0].charAt(i);
            boolean common = true;
            for(int j=0;j<n;j++) {
                if(strs[j].charAt(i)!=test) {
                    common = false;
                    break;
                }
            }
            if(common) {
                prefix = prefix + String.valueOf(test);
            }
            else 
                break;
        }
        return prefix;
    }
}