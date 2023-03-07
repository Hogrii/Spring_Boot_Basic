package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    // psvm + Enter치면 main 클래스를 만들어준다.
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        // Ctrl + Alt + v를 누르면 Member member를 자동으로 생성해준다.
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
