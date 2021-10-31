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
public class DLLNode<T> {

    T info;
    DLLNode<T> next;
    DLLNode<T> prev;

    public DLLNode() {
        next = null;
    }

    // Tạo phần tử cuối
    public DLLNode(T el) {
        info = el;
        next = null;
    }

    public DLLNode(T el, DLLNode<T> p, DLLNode q) {
        info = el;
        prev = p;
        next = q;
    }

}
