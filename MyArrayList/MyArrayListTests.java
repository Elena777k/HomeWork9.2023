package MyArrayList;

import java.util.ArrayList;

public class MyArrayListTests {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.add(99);
        list.remove(3);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.remove(1) = " + list.remove(1));
        System.out.println("list = " + list);
        list.add(1);
        System.out.println("list = " + list);
        System.out.println("list.remove(2) = " + list.remove(1));
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(2) = " + list.get(2));
        list.clear();
        System.out.println("list = " + list);
        list.add(5);
        System.out.println("list = " + list);
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.add(1);
        list.remove(3);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(3) = " + list.get(3));

        System.out.println("list.remove(1) = " + list.remove(1));
        System.out.println("list = " + list);
        list.add(1);
        System.out.println("list = " + list);


    }


}

