package order;

public class Test2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();
        ((Parent)child).sayHello();
    }
}
