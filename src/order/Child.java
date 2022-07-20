package order;

public class Child extends Parent{
    static Student childStaticStudent = new Student("3. child static object-");
    static {
        System.out.println("4. child static code execute");
    }
    {
        System.out.println("9. child code execute");
    }

    Student childStudent = new Student("10. child object-");

    Student student;

    public Child(){
        System.out.println("11. child constructor execute");
        student = new Student("12. child constructor create object-");
    }

    public void sayHello(){
        System.out.println("13. hello from child");
    }

}
