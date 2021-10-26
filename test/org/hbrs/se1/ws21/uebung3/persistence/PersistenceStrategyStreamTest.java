package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Container;
import org.hbrs.se1.ws21.uebung2.ContainerException;
import org.hbrs.se1.ws21.uebung2.Member;
import org.hbrs.se1.ws21.uebung2.MemberID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersistenceStrategyStreamTest {


    Container container=Container.getInstance();
    Container container2=Container.getInstance();//Test U3.3 Container= Container2
    PersistenceStrategyStream pss= new PersistenceStrategyStream();
    @Test
    void testAufNull() throws ContainerException {
        //Keine Strategie von außen gesetzt („Test auf NULL“)
        Member m1= new MemberID(1);
        Member m2= new MemberID(2);
        Member m3= new MemberID(3);
        container.addMember(m1);
        container.addMember(m2);
        container2.addMember(m3);

        assertEquals(3,container.size());
    }
    @Test
    void PersistenceStrategyMongoDB(){
        PersistenceStrategyMongoDB psmdb= new PersistenceStrategyMongoDB();
        Assertions.assertThrows(UnsupportedOperationException.class, psmdb::openConnection);
    }
    @Test
    void Location(){

        assertEquals(pss.getLocation(),"obj");
    }
    @Test
    void szenario() throws ContainerException, PersistenceException {


        Member m1= new MemberID(1);
        Member m2= new MemberID(2);
        Member m3= new MemberID(3);
        container.addMember(m1);
        container.addMember(m2);
        container.addMember(m3);
        assertEquals(container.size(),3);

        List<Member> members= new LinkedList<>();
        members.add(m1);
        members.add(m2);
        members.add(m3);

        Assertions.assertThrows(PersistenceException.class, ()->{
            container.store(members);
        });

        assertEquals(container.size(),3);

        container.deleteMember(1);
        container.deleteMember(2);
        container.deleteMember(3);
        assertEquals(container.size(),0);

        Assertions.assertThrows(PersistenceException.class, ()->{
        container.load();
            assertEquals(container.size(),3);
        });

    }

}