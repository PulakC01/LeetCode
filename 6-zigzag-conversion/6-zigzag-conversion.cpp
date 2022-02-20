class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows==1) {
            return s;
        }
        vector<vector<char>> arr(numRows);
        int row=0,count=0;
        bool add = true;
        for(int i=0;i<s.length();i++) {
            arr[row].push_back(s.at(i));
            if(count+1==numRows) {
                count=0;
                if(add) 
                    add = false;
                else 
                    add = true;
            }
            if(add)
                row++;
            else
                row--;
            count++;
        }
        string str = "";
        for(int i=0;i<numRows;i++) {
            str = str + string(arr[i].begin(), arr[i].end());
        }
        return str;
        
    }
};