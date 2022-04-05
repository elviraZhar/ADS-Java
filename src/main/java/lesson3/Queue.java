package lesson3;

public class Queue {
    private int[] queue;
    private int maxSize;
    private int nElement;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
        this.rear = -1;
        this.front = 0;
        this.nElement = 0;
    }

    public void insert(int element) {
        if (this.rear == this.maxSize - 1) {
            this.rear = -1;
        }

        this.queue[++this.rear] = element;
        ++this.nElement;
    }

    public int remove() {
        int temp = this.queue[this.front++];
        if (this.front == this.maxSize) {
            this.front = 0;
        }

        --this.nElement;
        return temp;
    }

    public boolean isEmpty() {
        return this.nElement == 0;
    }
}
