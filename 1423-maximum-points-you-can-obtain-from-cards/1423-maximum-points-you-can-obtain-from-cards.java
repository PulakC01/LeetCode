class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, rSum = 0, lSum = 0;
        for(int i = 0; i < k; ++i)
            lSum += cardPoints[i];
    
        int max = lSum;
        for(int i = 0; i < k; i++) {
            rSum += cardPoints[n-1-i];
            lSum -= cardPoints[k-1-i];
            max = Math.max(max,lSum+rSum);
        }
        return max;
    }
}