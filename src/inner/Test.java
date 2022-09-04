package inner;

public class Test {
    public static void main(String[] args) {
        // 实现类
        MyInterface myInterface = new MyImplement();
        myInterface.test();
        // 匿名内部类
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void test() {
                System.out.println("test");
            }
        };
        myInterface1.test();
    }
}
