package MyQueue;

public class MyQueue<T> extends Node<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;



    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        Node<T> current = front;
        while (current != null) {
            res.append(current.data);
            current = current.next;
            if (current != null) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }


    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }


    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }


    public int size() {
        return size;
    }


    public T peek() {
        if (front == null) {
            return null;
        }
        return front.data;
    }


    public T poll() {
        if (front == null) {
            return null;
        }

        T value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }
}

