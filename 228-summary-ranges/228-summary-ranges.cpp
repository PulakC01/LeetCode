class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> ans;
        vector<int> temp;
        if(nums.size()==0) return ans;
        int n = nums.size();
        temp.push_back(nums[0]);
        for(int i=1;i<n;i++) {
            if(nums[i]==(nums[i-1]+1)) {
                temp.push_back(nums[i]);
            }
            else {
                if(temp.size()==1)
                    ans.push_back(to_string(temp[0]));
                else {
                    string str = to_string(temp[0]) + "->" + to_string(temp[temp.size()-1]);
                    ans.push_back(str);
                }
                temp.clear();
                temp.push_back(nums[i]);
            }
        }
        if(temp.size()==1)
            ans.push_back(to_string(temp[0]));
        else if(temp.size()==0) {}
        else {
            string str = to_string(temp[0]) + "->" + to_string(temp[temp.size()-1]);
            ans.push_back(str);
        }
        return ans;
    }
};