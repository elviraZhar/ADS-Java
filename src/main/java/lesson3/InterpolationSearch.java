package lesson3;

public class InterpolationSearch {
    public static int search(Integer[] arr, int num2Find) {
        return search(arr, num2Find, 0, arr.length - 1);
    }

    public static int search(Integer[] arr, int num2Find, int start, int end) {
//        int start = 0;
//        int end = arr.length -1;
        int base;

        int i = 0;

        while (end >= start && num2Find >= arr[start] && num2Find <= arr[end]) {
            i++;
            if (arr[end].equals(arr[start])) {
                break;
            }
            base = (int)(start + 1.0 * (end - start) / (arr[end] - arr[start]) * (num2Find - arr[start]));

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

        if (arr[start].equals(num2Find)) {
            System.out.println("НАЙДЕНО! Количество итераций: " + i);
            return start;
        }
        System.out.println("Не найдено! Количество итераций: " + i);//визуализация
        return -1;
    }
}
