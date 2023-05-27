package MyQueue;

public class MyQueueTests {
    public static void main(String[] args) {
        MyQueue<String> list = new MyQueue<String>();
        list.add("Elena");
        System.out.println("list = " + list);
        list.add("Kristina");
        list.add("Princess");
        System.out.println("list.peek() = " + list.peek());
        System.out.println("list.poll() = " + list.poll());
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list = " + list);

    }

}
