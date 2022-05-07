class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int b[] = new int[n];
        
        if(k>n) 
            k = (k-n)%n;
        
        for (int i=0;i<n;i++)
            b[i] =  nums[(((n-k)+i)%n)];
        
        for(int i=0;i<n;i++)
            nums[i]=b[i];
    }
}