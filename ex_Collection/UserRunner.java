package ex_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRunner {

    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        users.add(new User("1", "first"));
        users.add(new User("2", "two"));
        users.add(new User("1", "first"));

        for (User user : users) {
            System.out.println(user);
        }
    }
}
