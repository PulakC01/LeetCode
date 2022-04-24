class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> m = new HashMap<>();
        String combined = s1 + " " + s2;
        String[] words = combined.split(" ");
        for (String w : words) {
            if(!m.containsKey(w))
                m.put(w,0);
            else
                m.put(w,m.get(w)+1);
        }
        ArrayList<String> res = new ArrayList<>();
        for (String w : m.keySet())
            if (m.get(w) == 0)
                res.add(w);
        return res.toArray(new String[0]);
    }
}