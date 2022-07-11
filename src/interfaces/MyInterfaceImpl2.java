package interfaces;

public class MyInterfaceImpl2 implements MyInterface<String>{
    private String value;

    public MyInterfaceImpl2(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
