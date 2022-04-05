package lesson2;

public class SortNotebooks {
    public static void sortNotebook (Notebook[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = min +1; j < arr.length; j++) {
                if (arr[j].getPrice() < arr[min].getPrice()) {
                    min = j;
                }
                if (arr[j].getPrice() == arr[min].getPrice()) {
                    if (arr[j].getMemory() < arr[min].getMemory()) {
                        min = j;
                    }
                }
            }
            Notebook temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }
}

