package lesson4;

public interface TwoSideLinkedList<E> {

    void insertLast(E value);

    E getLast();

    E removeFirst();

    E getFirst();

    int size();

    boolean isEmpty();

    void display();
}
