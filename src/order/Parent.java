package order;

public class Parent {
    static Student parentStaticStudent = new Student("1. parent static object-");
    static {
        System.out.println("2. parent static code execute");
    }
    {
        System.out.println("5. parent code execute");
    }
    Student parentStudent = new Student("6. parent object-");

    Student student;
    public Parent() {
        System.out.println("7. parent constructor executed");
        student = new Student("8. parent constructor create object-");
    }
    public void sayHello(){
        System.out.println("hello from parent");
    }
}
