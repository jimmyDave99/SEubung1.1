package org.hbrs.se1.ws21.uebung2;

public class MemberID implements Member{
    Integer id;
    public MemberID(Integer id){
        this.id=id;
    }

    @Override
    public Integer getID() {
        return id;
    }
    public String toString(){
        return "Member (ID =" + this.id + ")";
    }
}
