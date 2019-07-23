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
    
    public void inOrderTraverseTree(Node node) {
        if (node != null) {
            inOrderTraverseTree(node.left);
            
            System.out.println(node);
            
            inOrderTraverseTree(node.right);
        }
    }
    
    public void preOrderTraverseTree(Node node) {
        if (node != null) {
            System.out.println(node);
            
            preOrderTraverseTree(node.left);
            preOrderTraverseTree(node.right);
        }
    }
    
    public void postOrderTraverseTree(Node node) {
        if (node != null) {
            postOrderTraverseTree(node.left);
            postOrderTraverseTree(node.right);
            
            System.out.println(node);
        }
    }
}
