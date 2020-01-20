package edu.escuelaing.arem.ASE.app;

/**
 * Node
 */
public class Node<T> {
    public T value;
    public Node<T> next, prev ;

    public Node( T v, Node<T> next, Node<T> prev) {
        value = v;
        this.next = next;
        this.prev = prev;
        
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> next(){
        return next;
    }

    public Node<T> prev(){
        return prev;
    }


}
