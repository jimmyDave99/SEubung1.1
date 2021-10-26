package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Container;
import org.hbrs.se1.ws21.uebung2.ContainerException;
import org.hbrs.se1.ws21.uebung2.Member;
import org.hbrs.se1.ws21.uebung2.MemberID;

import java.util.LinkedList;
import java.util.List;

// Strategy Design Pattern (GoF).
public class Client {

    List<Member> contMember;
    /*public Client (Member clientMember) throws ContainerException {
        containerclient.addMember(clientMember);
    }*/

    public static void main(String[] args) throws ContainerException {
        Container containerclient = Container.getInstance();
        Member m1= new MemberID(1);
        Member m2= new MemberID(2);
        Member m3= new MemberID(3);
        Member m4= new MemberID(4);
        containerclient.addMember(m1);
        containerclient.addMember(m2);
        containerclient.addMember(m3);
        containerclient.addMember(m4);

        LinkedList<Member> listmemberClient= new LinkedList<>() ;
        listmemberClient.add(m1);
        listmemberClient.add(m2);
        listmemberClient.add(m3);
        listmemberClient.add(m4);
        MemberView mv= new MemberView();

        mv.dump(listmemberClient);
    }
}

