package collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Hello");
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        set.remove("World");
        System.out.println(set);
    }
}
