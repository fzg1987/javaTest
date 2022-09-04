package idea;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 1. 自动导包、自动删包
        Map map= new HashMap();
        // 2. if
        boolean flag = true;
        if (flag) {
        } if (!flag) {
        }
        // 3. for/while
        // 10.for
        for (int i = 0; i < 10; i++) {
        }
        while (flag) {

        }
        // 4. var
        // new String().var
        String s = new String();
        // 6. sout
        // "Hello world".sout
        System.out.println("Hello world");
        // 7.try
        // int num = 10/0;.try
        try {
            int num = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 8. List各种操作
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        for (Integer integer : list) {
            // list.for
        }
        for (int i = 0; i < list.size(); i++) {
            // list.fori
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            // list.forr
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasNext()) {
            Integer next =  iterator.next();
        }
    }
    public int test(){
        // 5. return
        return 10;
    }

}
