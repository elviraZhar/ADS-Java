package lesson4;

public interface LinkedList<E> {

    void insertFirst(E value);

    E removeFirst();

    boolean contains(E value);

    boolean remove(E value);

    int size();

    boolean isEmpty();

    void display();

    E getFirst();

    class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

           }
}
