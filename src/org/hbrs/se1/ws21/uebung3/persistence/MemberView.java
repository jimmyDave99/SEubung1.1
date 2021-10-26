package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Member;

import java.util.LinkedList;
import java.util.List;

public class MemberView {

    public void dump(List<Member> contMember){
        for (Member memb: contMember) {
            System.out.println(memb.toString());
        }
    }
}
