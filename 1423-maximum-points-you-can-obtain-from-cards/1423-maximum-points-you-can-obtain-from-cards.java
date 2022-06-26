class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, right = 0, left = 0;
        for(int i = 0; i < k; i++)
            left += cardPoints[i];
    
        int max = left;
        for(int i = 0; i < k; i++) {
            right += cardPoints[n-1-i];
            left -= cardPoints[k-1-i];
            max = Math.max(max, left+right);
        }
        return max;
    }
}