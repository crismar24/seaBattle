package ex5_oop;

public class Dog extends Animal {
    String bone;
    // Переопределили метод у потомка Dog от предка Animal
    void about() {
        System.out.println("не скажу ничего про себя");
    }

}
