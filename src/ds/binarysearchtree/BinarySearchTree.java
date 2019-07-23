package ds.binarysearchtree;

public class BinarySearchTree {
    
    public Node root;
    
    public void insert(String value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }
    
    public Node find(String value) {
        if (this.root.value == value) {
            return this.root;
        } else {
            return this.root.find(value);
        }
    }
    
    public void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            
            System.out.println(node);
            
            printTree(node.right);
        }
    }
}
