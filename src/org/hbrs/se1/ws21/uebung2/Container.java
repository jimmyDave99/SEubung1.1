package org.hbrs.se1.ws21.uebung2;

import java.util.LinkedList;

public class Container {
    Member member;
    LinkedList<Member> contMember= new LinkedList<>();
    int i=0;
    public void addMember(Member member)throws ContainerException{
        for(Member memberIt: contMember) {
            if (member.getID().equals(memberIt.getID())) {
                throw new ContainerException(member);
            }
        }
        contMember.add(member);
    }
    public  String deleteMember(Integer id){
        for (Member memberIt: contMember) {
            if(id.equals(memberIt.getID())) {
                contMember.remove(memberIt);
                return id + "gelöscht";
            }
        }
        return  "id nicht gefunden";
    }

    public void dump(){
        for (Member memb: contMember) {
            System.out.println(memb.toString());
        }
    }

    public int size(){
        return contMember.size();
    }

}
