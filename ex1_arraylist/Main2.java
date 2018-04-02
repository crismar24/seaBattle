package ex1_arraylist;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        int[] ints = new int[10];

        ArrayList list = new ArrayList();
        list.add(623);
        list.add(12);
        list.add("hello");
        list.add("hello");

        list.add(8685);

        list.remove("hello");
        
        System.out.println(list);

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
