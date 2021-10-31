/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly_linked_list;

/**
 *
 * @author SE150968 - Thai Thanh Phat
 */
public class DLL<T> {

    protected DLLNode<T> head, tail;

    // Initialize an empty list
    public DLL() {
        head = tail = null;
    }
    // Geteers, setters

    public DLLNode<T> getHead() {
        return head;
    }

    public void setHead(DLLNode<T> head) {
        this.head = head;
    }

    public DLLNode<T> getTail() {
        return tail;
    }

    public void setTail(DLLNode<T> tail) {
        this.tail = tail;
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add an element to the head of the list
    
    public void add(T el){
        addToTail(el);
    }
    public void addToHead(T el) {
        if (isEmpty()) {
            head = tail = new DLLNode(el, null, null);
        } else {
           DLLNode p = new DLLNode(el, null, head);
            head.prev = p;
            head = p;
        }
    }

    // Add an element to the end of the list
    public void addToTail(T el) {
        if (isEmpty()) {
            head = tail = new DLLNode(el, null, null);
        } else {
            DLLNode q = new DLLNode(el, tail, null);
            tail.next = q;
            tail = q;
        }
    }

    // delete the head and return the deleted info
    public T deleteFromHead() {
        if (isEmpty()) {
            return null;
        }
        T el = head.info;
        if (head == tail) {
            head = tail = null; // if only one node on the list;
        } else {
            head = head.next;
        }
        return el;
    }

    // delete the tail and return the deleted ìno
    public T deleteFromTail() {
        if (isEmpty()) {
            return null;
        }
        T el = tail.info;
        if (head == tail) {
            head = tail = null; // if only one node in the list;
        } else {              // if more than one node in the list,
            DLLNode<T> tmp;   // if more than one node in the  tail;
            for (tmp = head; tmp.next != tail; tmp = tmp = tmp.next);
            tail = tmp;               // the predescessor of tail becomes tail;
            tail.next = null;
        }
        return el;
    }

    // Delete the node containing info = el
    public void delete(T el) {
        if (!isEmpty()) {
            if (head == tail && el.equals(head.info)) {
                head = tail = null;
            } else if (el.equals(head.info)) {
                head = head.next;
            } else {
                DLLNode<T> pred, tmp;
                for (pred = head, tmp = head.next; tmp != null && !(tmp.info.equals(el));
                        pred = pred.next, tmp = tmp.next);
                if (tmp != null) {
                    pred.next = tmp.next;
                    if (tmp == tail) {
                        tail = pred;
                    }
                }
            }
        }

    }

    // Print the list
    public void printAll() {
        for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.info);
        }
    }
    // Checking whether the el element is in the list
    public boolean isInList (T el) {
        DLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        return tmp != null;
    }

}
