class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int check = -1;
        for(int i=0;i<n;i++) {
            if(matrix[i][0]<=target)
                check++;
            else
                break;
        }
        if(check<0)
            return false;
        int result = Arrays.binarySearch(matrix[check],target);  
        if (result < 0)  
            return false; 
        else  
            return true;
    }
}