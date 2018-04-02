package ex2_static;

public class Cat {
    String name;
    int age;    // = 0 при создании очередной кошки
    static int catsAmount;  //не буду пересоздаваться

    public Cat(String name) {
        this.name = name;
        catsAmount++;
    }

    void about() {
        System.out.println(name);
    }

    void showCatsAmount() {
        System.out.println(catsAmount);
    }
}
