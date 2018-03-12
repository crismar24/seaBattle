import java.util.Scanner;

/**
 * Created by Admin on 06.01.2018.
 */
public class Player {
    int getShoot(){
        // запрашиваем координаты выстрела, получить выстрел getshot
        System.out.println("Куда стрелять ?");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Вы ввели: %s\n", s);

        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
