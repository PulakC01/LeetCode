class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        priority_queue<pair<int,int>>maxheap;
        
        for(int i=0;i<points.size();i++) {
            int x = points[i][0], y = points[i][1];
            maxheap.push({x*x + y*y,i});

            if(maxheap.size() > k) 
                maxheap.pop();

        }

        vector<vector<int>> ans;
        while(maxheap.size()!=0) {
            ans.push_back(points[maxheap.top().second]);
            maxheap.pop();
        }

        return ans;
    }
};