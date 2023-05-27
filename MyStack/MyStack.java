package MyStack;

public class MyStack <T> {
    private Object[] stack;
    private int top;

    public MyStack() {
        stack = new Object[5];
        top = -1;
    }

    private void resizeStack() {
        int newLength = stack.length * 2;
        Object[] newStack = new Object[newLength];
        System.arraycopy(stack, 0, newStack, 0, stack.length);

        stack = newStack;

    }

    public void push(Object value) {
        if (top == stack.length - 1) {
            resizeStack();
        }

        top++;
        stack[top] = value;

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i <= top; i++) {
            res.append(stack[i]);
            if (i < top) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public Object remove(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Object removedElement = stack[index];
        for (int i = index; i < top; i++) {
            stack[i] = stack[i + 1];
        }
        stack[top] = null;
        top--;
        return removedElement;
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            stack[i] = null;
        }
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {

        return top == -1;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object poppedElement = stack[top];
        stack[top] = null;
        top--;
        return poppedElement;
    }




}
