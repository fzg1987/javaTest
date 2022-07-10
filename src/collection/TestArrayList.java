package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("JavaSE");
        list.add("JavaME");
        list.add("JavaEE");
        System.out.println(list.size());
        System.out.println(list.contains("JavaSE"));
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("Hello");
        list.remove(0);
        System.out.println(list);
        list.add("Hello");
        list.add(1,"我爱学Java");
        list.set(1,"ArrayList");
        System.out.println(list);
        System.out.println(list.indexOf("JavaME"));
        System.out.println(list.subList(1, 3)); // 前开后闭
    }
}
