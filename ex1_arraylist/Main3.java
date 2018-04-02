package ex1_arraylist;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        int[] ints = new int[10];

        ArrayList<Ship> list = new ArrayList<Ship>();
//        list.add(623);
//        list.add("hello");
//        list.add(12);
//        list.add("hello");
//        list.add(8685.0);
        list.add(new Ship());

        list.remove("hello");

        System.out.println(list);

        System.out.println(list.equals(623));

//        for (Object o : list) {
//            System.out.println(o);
//        }

    }
}
