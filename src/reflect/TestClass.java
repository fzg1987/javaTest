package reflect;

import entity.User;
import enums.Week;

import java.lang.reflect.Constructor;

public class TestClass {
    public static void main(String[] args) throws Exception{
        Class aClass = Class.forName("entity.User");
        System.out.println(aClass);
        Class[] interfaces = aClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        System.out.println(aClass.isAnnotation());
        System.out.println(aClass.isArray());
        System.out.println(aClass.isInterface());
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass);
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor<User> constructor1 = aClass.getConstructor(null);
        System.out.println(constructor1);
        Constructor<User> constructor2 = aClass.getConstructor(Integer.class, String.class);
        System.out.println(constructor2);
        User user1 = new User();
        System.out.println(user1);
        User user2 = constructor1.newInstance();
        System.out.println(user2);
        User user3 = constructor2.newInstance(1,"张三");
        System.out.println(user3);
    }
}
