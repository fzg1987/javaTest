package order;

public class Test {
    {
        System.out.println("code execute");
    }

    User user = new User();
    static {
        System.out.println("static code execute");
    }

    static User user1 = new User();

    public static void main(String[] args) {
        System.out.println("main() execute");
        Test test = new Test();
        Test test1 = new Test();
        Test test2 = new Test();
    }
}
