package composition;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        return list.remove(getSize() - 1);
    }

    public void push(Object element) {
        list.add(element);
    }

    @Override
    public MyStack clone() {
        try {
            MyStack copy = (MyStack) super.clone();
            copy.list = new ArrayList<>(list);
            return copy;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError(ex);
        }
    }

    @Override
    public String toString() {
        return "Стек: " + list;
    }
}
