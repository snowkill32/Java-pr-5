package arraystack;

import java.util.EmptyStackException;

public class GenericStack<E> {
    @SuppressWarnings("unchecked")
    private E[] elements = (E[]) new Object[2];
    private int size;

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    @SuppressWarnings("unchecked")
    public void push(E element) {
        if (size == elements.length) {
            E[] larger = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, larger, 0, size);
            elements = larger;
        }
        elements[size++] = element;
    }

    public E pop() {
        E element = peek();
        elements[--size] = null;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String result = "Стек: [";
        for (int i = 0; i < size; i++) {
            result += (i == 0 ? "" : ", ") + elements[i];
        }
        return result + "]";
    }
}
