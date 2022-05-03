class Solution {
public:
    int countGoodRectangles(vector<vector<int>>& rectangles) {
        int sideLen=0, maxLen=0, count=0;
        for(const auto& i:rectangles) {
            sideLen = min(i[0],i[1]);
            
            if(maxLen<sideLen) {
                maxLen=sideLen;
                count=1;
            }
            else if(maxLen==sideLen)
                ++count;
        }
        
        return count;
    }
};