package ex3_equals;

import java.util.Objects;

public class Cat extends Object{
    String name;
    int age = 10 ;    // = 0 при создании очередной кошки
    static int catsAmount;  //не буду пересоздаваться


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {   // блок инициализации - вызывается до конструктора - Статический блок

//        age = 20; //нельзя
        catsAmount = 100;
    }

    {   // блок инициализации - вызывается до конструктора

        age = 20;
        catsAmount = 100;
    }

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
    static void staticShowCatsAmount() {
        System.out.println(catsAmount);
//        about();    //нельзя
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
