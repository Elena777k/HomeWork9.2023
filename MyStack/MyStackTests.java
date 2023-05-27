package MyStack;

public class MyStackTests {
    public static void main(String[] args) {
        MyStack list = new MyStack<>();
        list.push("Elena");
        list.push("Kris");
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list = " + list);
        list.push("Elena");
        list.push("Kris");
        list.pop();
        System.out.println("list = " + list);
        list.peek();
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
    }
}
