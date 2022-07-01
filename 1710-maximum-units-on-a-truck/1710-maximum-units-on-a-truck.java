class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int units = 0;
        int i = 0;
        while(truckSize > 0 && i < boxTypes.length) {
            int[] boxtype = boxTypes[i++];
            int box = Math.min(truckSize, boxtype[0]);
            truckSize -= box;
            units += (box * boxtype[1]);
        }
        
        return units;
    }
}