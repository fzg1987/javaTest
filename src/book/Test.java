package book;

public class Test {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        cashier.getMember("ordinary").buyBook();
        cashier.getMember("super").buyBook();
    }
}
