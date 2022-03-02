class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        if (count(edges[1].begin(), edges[1].end(), edges[0][0]))
            return edges[0][0];
        else
            return edges[0][1];
        return 0;
    }
};