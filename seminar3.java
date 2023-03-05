import java.util.ArrayList;
import java.util.Random;

// public class seminar3 {
//     public static void main(String[] args) {
//         Random rnd = new Random();
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         for (int i = 0; i < 10; i++) {
//             int val = rnd.nextInt(-100, 100);
//             list1.add(val);
//         }
//         System.out.printf("Первоначальный список %s\n", list1);
//         int i = 0;
//         while (i < list1.size()) {
//             if (list1.get(i) % 2 == 0) {
//                 list1.remove(i);
//             } else {
//                 i++;
//             }
//         }
//         System.out.printf("Список с удаленными четными числами %s", list1);
//     }
// }

public class seminar3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        int sumItems = 0;
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float) sumItems / list1.size();
        System.out.printf("Максимальный элемент: %s\n", maxItem);
        System.out.printf("Минимальный элемент: %s\n", minItem);
        System.out.printf("Средний элемент: %s\n", average);
    }
}
