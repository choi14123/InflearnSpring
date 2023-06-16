package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();
    @Test
    void join (){
        Member member1 = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member1);
        Member findMember1 = memberService.findMember(1L);
        Assertions.assertThat(member1).isEqualTo(findMember1);

        Member member2 = new Member(2L, "memberB", Grade.VIP);
        memberService.join(member2);
        Member findMember2 = memberService.findMember(2L);
        Assertions.assertThat(findMember1).isNotIn(findMember2);
    }
}