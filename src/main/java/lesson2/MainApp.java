package lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainApp {
    public static void main (String[] args) {
        Random random = new Random();
        List<String> list = Arrays.asList("Lenuvo", "Asos", "MacNote", "Eser", "Xamiou");

        Notebook[] arr = new Notebook[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Notebook(list.get(random.nextInt(list.size())), random.nextInt(6)+1*4, random.nextInt(15)*100+500);
        }
        //arr = sortNotebook (Notebook[] arr);
        System.out.println(Arrays.toString(arr));
    }
}

