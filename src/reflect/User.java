package reflect;

public class User extends TestClass{
    private Integer id;
    public Double num;
    public Double score;
    public void test(){
        System.out.println("test");
    }
    public void test1(){

    }
    public void test2(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println(id);
        this.id = id;
    }
}
