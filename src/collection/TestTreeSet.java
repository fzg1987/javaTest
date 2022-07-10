package collection;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new A2(1));
        set.add(new A2(3));
        set.add(new A2(6));
        set.add(new A2(2));
        set.add(new A2(1));
        set.add(new A2(5));
        set.add(new A2(4));
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
class A2 implements Comparable{
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                '}';
    }

    public A2(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        A2 a = (A2) o;
        return Objects.equals(num, a.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    /**
     * A.compareTo(B)
     * 1 A>B
     * 0 A=B
     * -1 A<B
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        A2 a = (A2) o;
        if(this.num > a.num){
            return 1;
        } else if(this.num == a.num){
            return 0;
        } else {
            return -1;
        }
    }
}
