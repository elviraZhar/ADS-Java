package lesson3;

public class MainApp3 {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10};
        int sum = 0;

        int x;
        for(x = 0; x < number.length; ++x) {
            sum += number[x];
        }

        x = (number.length + 1) * (number.length + 2) / 2 - sum;
        System.out.println("пропущенное число " + x);
    }
}
