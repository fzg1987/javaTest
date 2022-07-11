package CommonClass;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.length());
        stringBuffer = new StringBuffer("Hello World");
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.charAt(2));
        stringBuffer.append("Java");
        System.out.println(stringBuffer);
        stringBuffer = stringBuffer.delete(3, 6);
        System.out.println(stringBuffer);
        stringBuffer = stringBuffer.deleteCharAt(3);
        System.out.println(stringBuffer);
        stringBuffer = stringBuffer.replace(2,3,"StringBuffer");
        System.out.println(stringBuffer);
        String str = stringBuffer.substring(2);
        System.out.println(str);
        str = stringBuffer.substring(2,8);
        System.out.println(str);
        stringBuffer = stringBuffer.insert(6,"six");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.indexOf("e"));
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);
        str = stringBuffer.toString();
        System.out.println(str);
    }
}
