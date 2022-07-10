package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.addFirst("A");
        list.addLast("B");
        System.out.println(list);
        list.push("JavaME");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.pop());
        System.out.println(list);
    }
}
