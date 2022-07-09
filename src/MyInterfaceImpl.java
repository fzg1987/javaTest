
public class MyInterfaceImpl implements MyInterface, MyInterface2{
    @Override
    public void fly() {
        System.out.println("可以飞");
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }
}
