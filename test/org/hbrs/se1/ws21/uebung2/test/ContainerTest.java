package org.hbrs.se1.ws21.uebung2.test;

import org.hbrs.se1.ws21.uebung2.Container;
import org.hbrs.se1.ws21.uebung2.ContainerException;
import org.hbrs.se1.ws21.uebung2.Member;
import org.hbrs.se1.ws21.uebung2.MemberID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {
    Container container=new Container();

    Member m1= new MemberID(1);
    Member m2= new MemberID(2);
    Member m3= new MemberID(3);
    @Test
    void testToString() {

    }
    @Test
    void testAddMember()throws ContainerException {
        container.addMember(m1);
        container.addMember(m2);
        container.addMember(m3);

        assertEquals(3,container.size());
        Assertions.assertThrows(ContainerException.class,()->{
            container.addMember(m2);
        });

    }
    @Test
    void testdeleteMember()throws ContainerException {
        container.addMember(m1);
        container.addMember(m2);
        container.addMember(m3);
        container.deleteMember(2);
        assertEquals(2,container.size());
    }
    @Test
    void testDump() {
    }
    @Test
    void testSize()throws ContainerException {
        container.addMember(m1);
        container.addMember(m2);
        assertEquals(2,container.size());
    }
}