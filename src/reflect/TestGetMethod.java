package reflect;

import book.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestGetMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class class1 = Class.forName("reflect.User");
        // 获取User类中所有public方法，包括父类方法
        Method[] methods = class1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("--------------------------");
        // 获取User类中独有的方法，不包括父类方法
        Method[] methods1 = class1.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        class1.getDeclaredMethod("test1",null);
        class1.getMethod("test2",null);
        User user = new User();
        user.test();
        Method testMethod = class1.getMethod("test",null);
        testMethod.invoke(user,null);
        Method setId = class1.getMethod("setId", Integer.class);
        setId.invoke(user, 2);
    }
}
