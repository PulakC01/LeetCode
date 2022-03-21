class Solution {
    public List<Integer> partitionLabels(String s) {
        if(s == null || s.length() == 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[26];  
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a'] = i;
        }
        int currentMax = 0;
        int start = 0;
        for(int i=0;i<s.length();i++) {
            currentMax = Math.max(currentMax , arr[s.charAt(i)-'a']);
            if(currentMax == i) {
                list.add(currentMax - start + 1);
                start = currentMax + 1;
            }
        }
        return list;
    }
}