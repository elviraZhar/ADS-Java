package lesson5;

public class MyBackpack {
    static final int MAX_WEIGHT = 5;

    static Thing[] things = {
            new Thing(4, 40000),
            new Thing(1, 5000),
            new Thing(5, 100),
            new Thing(3, 37000),
            new Thing(2, 10000),
    };

    public static void main(String[] args) {
        System.out.println(findBestRes(things.length - 1, MAX_WEIGHT));
    }

    private static int findBestRes(int i, int weigth) {
        if (i < 0) {
            return 0;
        }
        if (things[i].getWeight() > weigth) {
            return findBestRes(i-1, weigth);
        }
        else {
            return Math.max(findBestRes(i-1, weigth), findBestRes(i-1, weigth - things[i].getWeight()) + things[i].getValue());
        }
    }
}
