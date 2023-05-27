package MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.StringJoiner;

public class MyLinkedList<T> extends Node<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;



    public int size(){
        if (first == null) {
            return 0;
        }
        int size = 1;
        Node<T> last = first;
        while (last.next != null) {
            last = last.next;
            size++;
        }
        return size;
    }




    public void add(T value){
        Node<T> node = new Node<>(value);
        if (first == null) {
            first = last = node;
        } else  {
            last.next = node;
            last = node;
        }
        size++;

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        Node<T> current = first;
        while (current != null) {
            res.append(current.getValue());
            if (current.getNext() != null) {
                res.append(", ");
            }
            current = current.getNext();
        }
        res.append("]");
        return res.toString();
    }



    public Node<T> getNodeIndex(int index){
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Objects.checkIndex(index, size);
        return getNodeIndex(index).getValue();
    }


    public T remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Objects.checkIndex(index, size);
        T remElement;
        if (index ==0){
            remElement = first.getValue();
            first = first.next;
            if (first == null){ last = null;}
        } else {
            Node <T> prev = getNodeIndex(index -1);
            remElement = prev.next.getValue();
            prev.next = prev.next.next;
            if (index==size-1) {last = prev;}
        }
        size--;
        return  getValue();

    }
    public void remove (int index, T element) {
        Objects.checkIndex(index, size + 1);
        Node<T> node = new Node<>(element);
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;

        size++;
    }
    public void clear(){
        first = last = null;
        size = 0;
    }
}
