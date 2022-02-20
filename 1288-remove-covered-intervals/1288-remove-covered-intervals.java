class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int n = intervals.length;
        for(int[] i: intervals) {
            Boolean covers = false;
            int a = i[0]; int b = i[1];
            for(int[] j : intervals) {
                int c = j[0]; int d = j[1];
                if(i!=j) {
                    if(c<=a && b<=d) {
                        covers=true;
                        break;
                    }
                }
            }
            if(!covers) {
                m.put(a,b);
            }
        }
        return m.size();
    }
}