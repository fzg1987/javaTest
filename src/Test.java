public class Test {
    public static void main(String[] args) {
        try {
            test();
        } catch (NumberFormatException e) {
            System.out.println("抛出异常："+ e.getMessage());
        }
    }

    public static void test() throws NumberFormatException{
        String str = "Java";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}