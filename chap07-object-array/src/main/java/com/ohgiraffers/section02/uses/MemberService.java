package com.ohgiraffers.section02.uses;

public class MemberService {
    public  void singUpMembers() {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01","pass01",'남',20,"홍길동");
        members[1] = new Member(2, "user02","pass02",'여',16,"유관순");
        members[2] = new Member(3, "user03","pass03",'남',40,"이순신");
        members[3] = new Member(4, "user04","pass04",'여',36,"신사임당");
        members[4] = new Member(5, "user05","pass05",'남',22,"윤봉길");

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }


    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("-------- 가입된 회원 목록 --------");
        for (Member member: finder.findAllMembers()) {
            if (member != null) {
                System.out.println(member);
            }
        }
        System.out.println("------------------------------");
    }
}
