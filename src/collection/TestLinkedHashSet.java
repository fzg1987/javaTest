package collection;

import java.util.LinkedHashSet;
import java.util.Objects;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new A2(1));
        set.add(new A2(2));
        System.out.println(set);
    }
}
class A{
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

    public A(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        A a = (A) o;
        return Objects.equals(num, a.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
