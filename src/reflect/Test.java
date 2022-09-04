package reflect;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("reflect.InitDemo");
        Method[] methods = clazz.getMethods();
        if(methods != null){
            for (Method method : methods) {
                boolean isInitMethod = method.isAnnotationPresent(InitMethod.class);
                if(isInitMethod){
                    method.invoke(clazz.getConstructor().newInstance(),null);
                }
            }
        }
    }
}
