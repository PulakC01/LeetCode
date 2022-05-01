class Solution {
    public boolean backspaceCompare(String S, String T) {
        String a = getNewString(S);
        String b = getNewString(T);
        return a.equals(b);
    }
    
    public String getNewString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty())
                    stack.pop();
            } 
            else
                stack.push(c);
        }
        String res = "";
        while(!stack.isEmpty())
            res = res + stack.pop();
        return res;
    }
}
