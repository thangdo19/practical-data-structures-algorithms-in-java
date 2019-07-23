package ds.binarysearchtree;

public class Node {
    
    public Node left;
    public Node right;
    public String value;
    
    public Node(String value) {
        this.value = value;
    }
    
    public Node insert(String value) {
        if (isLessThanOrEqualTo(value)) {
            if (this.left == null) {
                this.left = new Node(value);
                return left;
            } else {
                return this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value);
                return right;
            } else {
                return this.right.insert(value);
            }
        }
    }
    
    public Node find(String value) {
        try {
            if (this.value == value) {
                return this;
            } else {
                if (isLessThanOrEqualTo(value)) {
                    return this.left.find(value);
                } else {
                    return this.right.find(value);
                }
            }
        } catch(NullPointerException e) {
            return null;
        }
    }
    
    public boolean isLessThanOrEqualTo(String value) {
        int compare = this.value.compareTo(value);
        
        return (compare <= 0); // <= 0 return true else return false
    }

    @Override
    public String toString() {
        return this.value;
    }
}
