package ex2_static;

public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
//        Cat cat2 = new Cat("Tom", 2);
//        System.out.println(cat1.catsAmount);  // не корректно
//        System.out.println(Cat.catsAmount);
        Cat.staticShowCatsAmount();
//        cat1.staticShowCatsAmount(); //нельзя

        // перемеенная catsAmount принадлжежит целиком классу, а не экземляру
        // обращаться к ней надо через класс




        
    }
}
