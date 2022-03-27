class Solution {
public:
    string addBinary(string a, string b) {
        int l1 = a.length();
        int l2 = b.length();
        int l = max(l1,l2);
        string temp = "";
        int carry = 0;
        for(int i=0;i<l;i++) {
            int x = 0;
            int y = 0;
            if(i<l1) {
                x = a[l1-i-1]-'0';
            }
            if(i<l2) {
                y = b[l2-i-1]-'0';
            }
            int sum = x+y+carry;
            if(sum>=2) {
                sum = sum%2;
                carry = 1;
            }
            else {
                carry = 0;
            }
            temp = to_string(sum)+temp;
        }
        if(carry==1) {
            temp = "1"+temp;
        }
        return temp;
    }
};