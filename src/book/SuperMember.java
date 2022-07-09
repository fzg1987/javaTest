package book;

public class SuperMember extends Member{
    @Override
    public void buyBook(){
        System.out.println("超级会员买书打6折");
    }
}
