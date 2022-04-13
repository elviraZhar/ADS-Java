package lesson4;

public class Deque<E> {
    Node<E> first;
    Node<E> last;
    Node<E> prev;
    Node<E> current;
    int size;

    class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;
        public Node(Node<E> prev, E value, Node<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(E value) {
        insertFirst(value);
        if (size == 1) {
            last = first;
        }
    }

    public void insertLast(E value) {
        if (isEmpty()) {
            insertFirst(value);
            return;
        }
        last.next = last = new Node<E>(current, value, null);
    }

     public E removeFirst() {
        E removedValue = removeFirst();

        if (isEmpty()) {
            last = null;
        }
        return removedValue;
    }

    public E removeLast() {
        E removeValue = removeLast();
        return removeValue;
    }

    public boolean remove(E value) {
        Node<E> prev = null;
        Node<E> current = first;

        while (current != null) {
            if (current.value.equals(value)) {
                break;
            }
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        if (current == first) {
            removeFirst();
            return true;
        }

        prev.next = current.next;
        current.next = null;
        size--;

        return true;
    }

    public boolean contains(E value)
    {
        return indexOf(value) != null;
    }

    private Node<E> indexOf(E value) {
        Node<E> prev = null;
        Node<E> current = first;

        while (current != null) {
            if (current.value.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public E getLast() {
        return last.value;
    }

    public E getFirst() {
        return first.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        Node<E> current = first;

        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.append("]").toString();
    }

    public String toString2() {
        StringBuilder sb = new StringBuilder("[");

        Node<E> current = last;

        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.append("]").toString();
    }
}