package lesson3;

public class MyQueue {
    public MyQueue() {
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);
        myQueue.insert(50);

        myQueue.remove();
        myQueue.remove();
        myQueue.remove();

        myQueue.insert(60);

        while(!myQueue.isEmpty()) {
            int n = myQueue.remove();
            System.out.println("Элемент " + n);
        }

    }
}
