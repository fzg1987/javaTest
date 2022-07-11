package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCollections {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("Hello");
    list.add("World");
    System.out.println(list);
    Collections.addAll(list,"Java","JavaSE","JavaME");
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
    Collections.swap(list, 1, 3);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    int index = Collections.binarySearch(list,"JavaME");
    System.out.println(index);
    Collections.replaceAll(list,"Java","C++");
    System.out.println(list);
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));
  }
}
