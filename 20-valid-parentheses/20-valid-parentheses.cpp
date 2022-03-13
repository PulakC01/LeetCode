class Solution {
public:
    bool isValid(string s) {
        stack<char> t;
        for(char c : s) {
            if(c == '('|| c == '{' || c == '[') {
                t.push(c);
            }
            else {
                if(t.empty())
                    return false;
                if(c == ')' && t.top() != '(')
                    return false;
                if(c == '}' && t.top() != '{')
                    return false;
                if(c == ']' && t.top() != '[')
                    return false;
                t.pop();
            }
        }
        return t.empty();
    }
};

