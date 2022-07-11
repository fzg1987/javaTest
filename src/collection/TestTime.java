package collection;

import entity.Time;

public class TestTime {
    public static void main(String[] args){
        test(new Time<Integer>());
        test2(new Time<Object>());
    }
    public static void test(Time<? extends Number> time){
    }
    public static void test2(Time<? super String> time){
    }
}
