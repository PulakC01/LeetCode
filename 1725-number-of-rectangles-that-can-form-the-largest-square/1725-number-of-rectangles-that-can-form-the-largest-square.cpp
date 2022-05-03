class Solution {
public:
    int countGoodRectangles(vector<vector<int>>& rectangles) {
        unordered_map<int, int> m;
        int val = INT_MIN;
        for(int i=0;i<rectangles.size();i++) {
            int temp = *min_element(rectangles[i].begin(), rectangles[i].end());
            m[temp]++;
            val = max(val, temp);
        }
        return m[val];
    }
};