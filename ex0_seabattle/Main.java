/**
 * Created by Admin on 06.01.2018.
 */
package ex0_seabattle;
public class Main {

    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();

        field.init();   // проинициализировали поле, заполнили точками ..........
        field.setShips();    //установили корабли на поле 'X' 'XX'

        System.out.println("field.ships.length = " + field.ships.length);
        System.out.println("Game start !");

        // основной игровой цикл //
        // проверка
        // проверка 2
        // проверка 3
        do {
            field.show();   // показать игровое поле в начале
            int shoot = player.getShoot();  //получить от игрока выстрел, координаты выстрела
            field.doShoot(shoot);   //сказать полю сделай выстрел с кординатой
        } while (field.isNotGameOver());
    }
}
