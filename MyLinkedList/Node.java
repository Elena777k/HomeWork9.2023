package MyLinkedList;


import java.util.Arrays;
import java.util.StringJoiner;

public class Node <T>{
    private T value;
    Node<T> next;




    public Node(T element) {
        this.value = element;
    }

    public Node() {
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

}
