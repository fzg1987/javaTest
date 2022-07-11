package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("h","Hello");
        map.put("w","World");
        map.put("j","Java");
        map.put("s","JavaSE");
        map.put("m","JavaME");
        map.put("e","JavaEE");
        map.put("e","Java");
        System.out.println(map);
        map.remove("a");
        System.out.println(map);
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue("Java"));
        Set keys = map.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println(map.get("w"));
    }
}
