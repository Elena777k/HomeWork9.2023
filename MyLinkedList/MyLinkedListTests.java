package MyLinkedList;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("Elena");
        list.add("Kris");
        list.add("Nata");
        list.add("Sem");

        System.out.println("list.get(1) = " + list.get(1));
        list.remove(0);


        System.out.println("list.get(0) = " + list.get(0));
        list.clear();
        list.add("Lers");
        list.add("Vlad");
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.size() = " + list.size());
        list.add("Jim");
        list.add("Ira");
        list.add("Kos");
        list.add("Vlad");
        System.out.println("list.size() = " + list.size());
        list.clear();
        System.out.println("list.size() = " + list.size());
        list.add("Alex");
        list.add("k");
        list.add("Kos");
        list.add("Vlad");
        System.out.println("list.size() = " + list.size());
        list.remove(0);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        list.remove(2);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.size() = " + list.size());
        System.out.println("list.remove(5) = " + list.remove(0));
        System.out.println("list = " + list);


    }
}

