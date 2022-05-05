class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        for(int i=0;i<arr.length;i++) {
            String s = arr[i];
            s = s.toLowerCase();
            if(s.length()>2)
                s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            
            arr[i] = s;
        }
        return String.join(" ",arr);
    }
}