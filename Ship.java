import java.util.Random;

/**
 * Created by Admin on 06.01.2018.
 */
public class Ship {
    int positionStart;
    int positionEnd;
    int size;

//    public Ship(int position) {
//        this.position = position;
//    }
    void initWithRandomPositionAndSize() {
        Random random = new Random();
        size = random.nextInt(3) + 1; // 1 - 3
        positionStart = random.nextInt(Field.SIZE - size + 1);
        positionEnd = positionStart + size;
     }

     boolean isIntersectWithAnotherShip(Ship ship) {
         // 0123456789
         // 0123    89
         //      56

         // проверяем корабль 56 на пересечение с 0123(плюс пустая ячейка) и с (плюс пустая ячейка)89
         if (positionStart > ship.positionEnd + 1) {
             return false;
         }
         if (positionEnd + 1 < ship.positionStart) {
             return false;
         }
         return true;
     }

     // если двухмерный морской бой - нужно написать две проверки - вертикальную и горизонтальную
}
