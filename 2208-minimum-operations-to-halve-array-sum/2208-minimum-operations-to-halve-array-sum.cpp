class Solution {
public:
    int halveArray(vector<int>& nums) {
        double sum = 0;
	    priority_queue<double> heap;
        for(auto x : nums) {
		     sum += x;
             heap.push(x);
		}
        
        double ans = sum;
        int count = 0;
        while(sum > ans/2.0) {
            count++;
            double top = heap.top();
            heap.pop();
            sum -= top/2.0;
            top = top/2.0;
            heap.push(top);
        }
        return count;
    }
};