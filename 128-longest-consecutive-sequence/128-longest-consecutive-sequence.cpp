class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> s(nums.begin(), nums.end());
        nums.assign(s.begin(), s.end());
        if(nums.size()==0) return 0;
        int longest = 0, count = 0;
        for(int i=0;i<nums.size()-1;i++) {
            if(nums[i]+1==nums[i+1]) {
                count+=1;
                longest = max(count,longest);
                cout<<count<<" ";
            }
            else {
                count=0;
            }
        }
        return (longest+1);
    }
};
