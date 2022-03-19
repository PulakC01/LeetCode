class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                map.remove(s.charAt(i));
            } else {
                map.put(s.charAt(i), i);
                set.add(s.charAt(i));
            }
        }
        int index = Integer.MAX_VALUE;
        if(map.size()==0)
            return -1;
        for(int value : map.values()) {
            index = Math.min(index, value);
        }
        return index;
    }
}