package lesson4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleLinkedListImpl<E> implements LinkedList<E>, Iterable<E> {

    protected Node<E> first;
    protected int size;

    @Override
    public void insertFirst(E value) {
        first = new Node<>(value, first);
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> removedNode = first;
        first = removedNode.next;
        removedNode.next = null;
        size--;

        return removedNode.value;
    }

    @Override
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

    @Override
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

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public void display() {

        System.out.println(this);
    }

    @Override
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

    @Override
    public E getFirst() {
        return first.value;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>();
    }

    private class ListIterator<E> implements Iterator<E> {
        Node<E> current;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (current == null) {
                throw new NoSuchElementException();
            }
            Node<E> value = current;
            return (E) value;
        }

    }
}
