class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        unordered_map<int, vector<int>> map;
        vector<vector<int>> ans;
        for(int i=0;i<groupSizes.size();i++) {
            map[groupSizes[i]].push_back(i);
        }
        
        for(auto i = map.begin(); i != map.end(); i++) {
            int n = i->first;
            vector<int> v = i->second;
            int size = v.size()/n;
            vector<int> vec[size];
            for(int k = 0; k < size; ++k) {
                auto start_itr = std::next(v.cbegin(), k*n);
                auto end_itr = std::next(v.cbegin(), k*n + n);
                vec[k].resize(n);
                std::copy(start_itr, end_itr, vec[k].begin());
                ans.push_back(vec[k]);
            }
        }
        return ans;
    }
};