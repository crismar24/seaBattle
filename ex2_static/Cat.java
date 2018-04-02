package ex2_static;

public class Cat {
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



}
