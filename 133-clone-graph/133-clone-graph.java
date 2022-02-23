/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        
        Node result=new Node(node.val);
        List<Node> nodes = new ArrayList<Node> ();
        List<Node> resultNodes = new ArrayList<Node> ();
        nodes.add(node);
        resultNodes.add(result);
        int n = 0;
        while(n < nodes.size()) {
            for(Node nd : nodes.get(n).neighbors) {
                if(!nodes.contains(nd)){
                    nodes.add(nd);
                    resultNodes.add(new Node(nd.val));
                }
                resultNodes.get(n).neighbors.add(resultNodes.get(nodes.indexOf(nd)));
            }
             n++;   
        } 
        return result;  
    }
}