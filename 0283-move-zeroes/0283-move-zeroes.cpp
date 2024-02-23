class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int count = 0, n = nums.size();
        for(int i=0;i<n;i++) {
            if(nums[i]==0)
                count++;
        }
        if(count==0)
            return;
        
        int j=0;
        for(int i=0;i<n;i++) {
            if(nums[i]!=0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=n-count;i<n;i++) {
            nums[i]=0;
        }
    }
};