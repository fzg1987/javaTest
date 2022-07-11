package collection;

import java.util.*;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(new User(3,"Java"),"Java");
        map.put(new User(5,"JavaME"),"JavaME");
        map.put(new User(4,"JavaSE"),"JavaSE");
        map.put(new User(1,"Hello"),"Hello");
        map.put(new User(2,"World"),"World");
        map.put(new User(7,"Java"),"Java");
        map.put(new User(6,"JavaEE"),"JavaEE");
        System.out.println(map);
    }
}
class User implements Comparable{
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        User u = (User) o;
        if (this.id > u.id) {
            return 1;
        } else if(this.id == u.id){
            return 0;
        } else{
            return -1;
        }
    }
}
