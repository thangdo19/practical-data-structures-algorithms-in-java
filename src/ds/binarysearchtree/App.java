/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.binarysearchtree;

/**
 *
 * @author User
 */
public class App {
    public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert("b");
		bst.insert("a");
		bst.insert("d");
		bst.insert("c");

                
                bst.postOrderTraverseTree(bst.root);
    }
}