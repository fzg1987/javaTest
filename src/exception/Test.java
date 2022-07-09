package exception;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            System.out.println(test.add(1.1));
        } catch (MyNumberException e) {
            e.printStackTrace();
        }
    }

    public double add(Object object) throws MyNumberException{
        if(!(object instanceof Number)){
            String str = "传入的参数不是数字类型";
            throw new MyNumberException(str);
        } else {
            double num = (double)object;
            return ++num;
        }
    }
}
