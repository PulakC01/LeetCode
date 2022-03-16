class Solution {
public:
    string removeOuterParentheses(string s) {
        stack<char> t;
        for(int i=0;i<s.length();i++) {
            if(s[i]=='(') {
                if(t.empty())
                    s[i]='*';
                t.push(s[i]);
            }
            if(s[i]==')') {
                t.pop();
                if(t.empty())
                    s[i] = '*';
            }
        }
        s.erase(remove(s.begin(), s.end(), '*'), s.end());
        return s;
    }
};