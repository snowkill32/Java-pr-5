package arraystack;

public class TestArrayStack {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("Размер: " + stack.getSize());
        System.out.println("Вершина без удаления: " + stack.peek());
        System.out.println("Размер после peek: " + stack.getSize());
        System.out.print("Извлечение: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nСтек пуст: " + stack.isEmpty());
    }
}
