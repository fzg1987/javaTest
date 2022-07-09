package book;

public class OrdinaryMember extends Member{
    @Override
    public void buyBook() {
        System.out.println("普通会员买书打9折");
    }
}
