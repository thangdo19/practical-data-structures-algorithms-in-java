/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.singlylinkedlist;

/**
 *
 * @author User
 */
public class Node {
    
    public int data;
    public Node next;
    
    public void displayNode() {
        System.out.println(" { " + this.data + " } ");
    }
}
