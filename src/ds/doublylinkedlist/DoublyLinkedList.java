/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.doublylinkedlist;

/**
 *
 * @author User
 */
public class DoublyLinkedList {
    
    private Node first;
    private Node last;
    
    public DoublyLinkedList() {
        first = null;
        last = null;
    }
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        
        newNode.previous = null;
        newNode.next = first;
        first = newNode;
    }
    
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        
        newNode.previous = last;
        newNode.next = null;
        last = newNode;
    }
    
    public boolean insertAfter(int key, int data) {
        Node current = first;
        
        while(current.data != key) {
            current = current.next;
            if (current == null ) {
                return false;
            }
        }
        
        Node newNode = new Node();        
        newNode.data = data;
        
        if (current == last) {
            newNode.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
        
        newNode.previous = current;
        newNode.next.previous = newNode;
        
        return true;
    }
    
    public void deleteFirst() {
        if (first == null) {
            return;
        }
        
        if (first.next == null) {
            last = null;
        }
        
        first = first.next;
        first.previous = null;
    }
    
    public void deleteLast() {
        if (first == null) {
            return;
        }
        
        if (last.previous == null) {
            first = null;
        }
        
        last = last.previous;
        last.next = null;
    }
    
    public void deleteKey(int key) {
        if (first == null) {
            return;
        }
        
        Node node = first;
        
        while((node != null) && (node.data != key)) {
            node = node.next;
        }
        
        if (node == null) {
            return;
        }
        
        if (node == first) {
            first = node.next;
        } else {
            node.previous.next = node.next;
        }
        
        if (node == last) {
            last = node.previous;
        } else {
            node.next.previous = node.previous;
        }
    }
    
    public void displayForward() {
        if (first == null) {
            return;
        }
        
        Node current = first;
        
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        
        System.out.println();
    }
    
    public void displayBackward() {
        if (first == null) {
            return;
        }
        
        Node current = last;
        
        while(current != null) {
            current.displayNode();
            current = current.previous;
        }
        
        System.out.println();
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
}
