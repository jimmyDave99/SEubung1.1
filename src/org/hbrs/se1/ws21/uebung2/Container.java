package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws21.uebung3.persistence.PersistenceStrategyStream;

import java.util.LinkedList;
import java.util.List;

public class Container {
    Member member;
    LinkedList<Member> contMember= new LinkedList<>();
    PersistenceStrategyStream<Member> pers=new PersistenceStrategyStream<>();
    int i=0;

    private static final Container instance= new Container();
    private Container(){}

    public static Container getInstance(){
        return instance;
    }
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
    public List<Member> getCurrentList(){
        return contMember;
    }

    public int size(){
        return contMember.size();
    }

    public void store(List<Member> members) throws PersistenceException {
        pers.save(contMember);
    }

    public void load() throws PersistenceException {
        contMember= (LinkedList<Member>) pers.load();
    }
}
