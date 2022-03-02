class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        if (std::count(edges[1].begin(), edges[1].end(), a))
            return a;
        else
            return b;
        return 0;
    }
};