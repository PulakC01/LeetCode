class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();
        
        a = fillStack(S);
        b = fillStack(T);
        
        while (!a.isEmpty() || !b.isEmpty()){
            if (a.isEmpty() ^ b.isEmpty()){
                return false;
            } else if (a.pop() != b.pop()){
                return false;
            }
        }
        return true;
    }
    
    public Stack<Character> fillStack(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '#'){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack;
    }
}