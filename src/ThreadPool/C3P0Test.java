package ThreadPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.lang.reflect.Field;
import java.sql.Connection;

public class C3P0Test {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setInitialPoolSize(1);
        dataSource.setMaxPoolSize(1);
        Connection connection = dataSource.getConnection();
        Object inner = getInner(connection);

        connection.close();
        Connection connection1 = dataSource.getConnection();
        Object inner1 = getInner(connection1);

        System.out.println(connection == connection1);
        System.out.println(inner == inner1);
    }

    public static Object getInner(Object connection){
        Object result = null;
        Field field = null;
        try {
            field = connection.getClass().getDeclaredField("inner");
            field.setAccessible(true);
            result = field.get(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
