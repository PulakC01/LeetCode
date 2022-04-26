class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 != 0) 
            return new int[0];
        
        int n = changed.length/2;
        
        int[] ans = new int[n];
        
        int[] freq = new int[100001];
        
        for(int x : changed)
            freq[x]++;
        
        
        int index = 0;
        
        for(int x=0; x<freq.length; x++){
            
            while(freq[x] > 0 && x*2 < 100001 && freq[x*2]>0){
                freq[x]--;
                freq[x*2]--;
                ans[index++] = x;
            }
        }
        
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0) 
                return new int[0];
        }
        return ans;
    }
}