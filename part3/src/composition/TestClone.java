package composition;

public class TestClone {
    public static void main(String[] args) {
        MyStack original = new MyStack();
        original.push("первая");
        original.push("вторая");
        MyStack copy = original.clone();
        System.out.println("Разные объекты: " + (original != copy));
        System.out.println("Оригинал до изменения: " + original);
        System.out.println("Копия до изменения: " + copy);
        copy.pop();
        copy.push("новая");
        System.out.println("Оригинал после изменения копии: " + original);
        System.out.println("Копия после изменения: " + copy);
    }
}
