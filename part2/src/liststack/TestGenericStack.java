package liststack;

import java.util.Scanner;

public class TestGenericStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите строку " + i + ": ");
            stack.push(input.nextLine());
        }
        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        input.close();
    }
}
