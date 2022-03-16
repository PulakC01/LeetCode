class Solution {
public:
    int maxDepth(string s) {
        stack<char> t;
        int ans = 0, count = 0;
        for(auto i:s) {
            if(i=='(') {
                t.push(i);
                count++;
            }
            if(i==')') {
                ans =  std::max(ans,count);
                t.pop();
                count--;
            }
        }
        return ans;
    }
};