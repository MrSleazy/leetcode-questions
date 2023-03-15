package stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Stack implementation using doubly linked list
 *
 * @param <T> items
 */
public class CustomStack<T> implements Iterable<T> {

    private LinkedList<T> list = new LinkedList<>();
    private int size = 0;

    public CustomStack() {
    }

    public CustomStack(T item) {
        push(item);
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }

    public T peek() {
        if (isEmpty()) return null;
        return list.peekLast();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
