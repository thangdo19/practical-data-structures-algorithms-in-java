/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.circularlinkedlist;

/**
 *
 * @author User
 */
public class CircularLinkedList {
    
    private Node first;
    private Node last;
    
    public CircularLinkedList() {
        first = null;
        last = null;
    }
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (isEmpty()) {
            last = newNode;
        }
        
        newNode.next = first;
        first = newNode;
        last.next = first;
    }
    
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        }
        
        newNode.next = first;
        last.next = newNode;
        last = newNode;
    } 
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public int deleteFirst() {
        if (first == null) {
            System.out.println("The Linked List is empty");
            return -1;
        }
        
        int data = first.data;
        
        if (first.next == first) {
            last = null;
        }
        
        first = first.next;
        return data;
    }
    
    public void displayList() {
        Node currentNode = first;
        
        if (currentNode != null) {
            do {
                currentNode.displayNode();
                currentNode = currentNode.next;
            }
            while (currentNode != first);

            System.out.println();
        }
    }
}
