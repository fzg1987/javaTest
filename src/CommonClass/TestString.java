package CommonClass;

public class TestString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");
        char[] array = {'J','a','v','a',',','H','e','l','l','o',',','w','o','r','l','d'};
        String str3 = new String(array);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str3.isEmpty());
        System.out.println(str3.charAt(2));
        System.out.println(str3.indexOf('a'));
        System.out.println(str1.equals(str2));
        String str4 = "JAVA";
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str3.startsWith("Ja"));
        System.out.println(str3.endsWith("va"));
        System.out.println(str3.substring(2));
        System.out.println(str3.substring(2, 6));
        str3 = str3.replaceAll("world","Java");
        System.out.println(str3);
        String[] split = str3.split(",");
        for (String str : split) {
            System.out.println(str);
        }
        byte[] bytes = str3.getBytes();
        char[] chars = str3.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
    }
}
