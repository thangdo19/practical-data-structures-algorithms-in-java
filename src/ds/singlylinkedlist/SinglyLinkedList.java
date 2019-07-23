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
public class SinglyLinkedList {
    
    public Node first;
    
    public void insertFirst(int data) {
        Node newNode = new Node(); // create a new Node
        newNode.data = data;
        newNode.next = first; // newNode's next : current first node
        
        first = newNode; // newNode -> the first node
    }
    
    public void insertLast(int data) {        
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        
        if (first == null) {
            first = newNode;
            return;
        }
        
        Node currentNode = first;
        
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        
        currentNode.next = newNode;
    }
    
    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        
        return temp;
    }
    
    public Node deleteLast() {
        Node currentNode = first;
        Node previousNode = null;
        
        while(currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        
        if (previousNode != null) {
            previousNode.next = null;
        }
        else {
            first = null;
        }
        
        return currentNode;
    }
    
    public void displayList() {
        if (first == null) {
            return;
        }
        
        Node currentNode = first;
        
        while (currentNode.next != null) {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
        
        currentNode.displayNode();
    }
}
