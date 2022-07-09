package book;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Cashier {

    private Member member;

    public Member getMember(String name) {
        if(name.equals("ordinary"))
            return new OrdinaryMember();
        else {
            return new SuperMember();
        }
    }

    public void setMember(Member member) {
        this.member = member;
    }


    public void settlement(){
        member.buyBook();
    }
}
