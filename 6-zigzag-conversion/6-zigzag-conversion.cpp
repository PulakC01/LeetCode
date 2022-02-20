class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows==1) {
            return s;
        }
        vector<vector<char>> arr(numRows);
        int k = 0,t= numRows-2;
        int n = numRows;
       //ool add = true;
        for(int i=0;i<s.length();i++) {
            if(k<n){
                arr[k].push_back(s.at(i));
                k++;
            }
            else if(t>0){
               arr[t].push_back(s.at(i));
               t--;
            }
            if(k==n && t==0) {
               k=0;
               t=n-2;
            }
        }
        string str = "";
        for(int i=0;i<numRows;i++) {
            str = str + string(arr[i].begin(), arr[i].end());
        }
        return str;   
    }
};