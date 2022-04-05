package lesson2;

public class SelectionSort {
    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            int max = arr.length;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
                if (arr[j] > arr[arr.length]) {
                    max = j;
                }
            }
            int tempmin = arr[i];
            arr[i] = arr[min];
            arr[min] = tempmin;
            int tempmax = arr[arr.length];
            arr[arr.length] = arr[max];
            arr[max] = tempmax;
        }
    }
}
