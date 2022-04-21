package lesson6;

import java.util.Random;

public class MainApp6 {

    public static void main (String[] args) {
        Random random = new Random();

        TreeImpl<Integer> test = new TreeImpl<>();
        while (test.size() < 14) {
            test.add(random.nextInt(50) - 25);
        }
        test.display();
    }
}// Из 20 запусков 1 (5%) дерево можно назвать "сбалансированным" - была поглешность на 1 элемент ушедший в 5 уровень
// остальные 19 были несбалансированы
