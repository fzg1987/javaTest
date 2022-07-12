package reflect;

import java.lang.reflect.Field;

public class TestGetName {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
    Class class1 = Class.forName("reflect.User");
    // 获取全部的成员变量，必须public
    Field[] fields = class1.getFields();
    for (Field field : fields) {
      System.out.println(field);
    }
    System.out.println("---------------------------------");
    // 获取目标类独有的成员变量
    Field[] declaredFields = class1.getDeclaredFields();
    for (Field declaredField : declaredFields) {
      System.out.println(declaredField);
    }
    System.out.println("---------------------------------");
    System.out.println(class1.getField("num"));
    System.out.println("---------------------------------");
    System.out.println(class1.getDeclaredField("id"));
    System.out.println("---------------------------------");

    User user = new User();
    Field id = class1.getDeclaredField("id");
    id.setAccessible(true);
    id.set(user,1);
    System.out.println("user==========" + id.get(user));
  }
}
