package ex_Collection;

import java.util.*;

public class main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");

        for (String s : list) {
            System.out.println(s);

        }
    }

}
