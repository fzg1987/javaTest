package interfaces;

public class MyInterfaceImpl<T> implements MyInterface<T>{
    private T value;
    public MyInterfaceImpl(T t) {
        this.value = t;
    }

    @Override
    public T getValue() {
        return this.value;
    }
}
