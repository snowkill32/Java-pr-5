package liststack;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {
    public int getSize() {
        return size();
    }

    public E peek() {
        return get(size() - 1);
    }

    public E pop() {
        return remove(size() - 1);
    }

    public void push(E element) {
        add(element);
    }

    @Override
    public String toString() {
        return "Стек: " + super.toString();
    }
}
