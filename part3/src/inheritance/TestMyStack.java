package inheritance;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();
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
