class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        for(int i=1;i<edges.size();i++) {
            if (std::count(edges[i].begin(), edges[i].end(), a))
                return a;
            else
                return b;
        }
        return 0;
    }
};