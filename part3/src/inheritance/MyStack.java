package inheritance;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        return remove(size() - 1);
    }

    public void push(Object element) {
        add(element);
    }

    @Override
    public String toString() {
        return "Стек: " + super.toString();
    }
}
