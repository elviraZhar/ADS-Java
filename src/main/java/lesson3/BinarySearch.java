package lesson3;

public class BinarySearch {
    public static int search(Integer[] arr, int num2Find) {//добавление для ввода в экспонентциальный поиск
        return search(arr, num2Find, 0, arr.length - 1);//

    }

    public static int search(Integer[] arr, int num2Find, int start, int end) {
//        int start = 0;
//        int end = arr.length -1;
        int base;

        int i = 0;

        while (end >= start) {
            i++;
            base = (start + end) / 2;
            System.out.println("Base " + base);

            if (arr[base] == num2Find) {
                System.out.println("НАЙДЕНО! Количество итераций: " + i);//визуализация
                return base;
            } else if (arr[base] < num2Find) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }
        System.out.println("Не найдено! Количество итераций: " + i);//визуализация
        return -1;

    }

    public static int search(Integer[]arr, int num2Find, int end) {
        return -1;
    }
}
