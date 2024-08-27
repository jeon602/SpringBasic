package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class memberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given :
        Member member =new Member(1L,"memberA",Grade.VIP);

        //when
        memberService.join(member);
        Member findMember =memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
//테스트 위한 멤버 객체 생성, 멤버 객체 id가 1L,memberA등급이 Grade.VIP로 설정
// join 메소드를 사용해 아이디가 1L인회원 조회, (조인을 통해 등록한 회원이어야 함)
//AssertJ 라이브러리를 사용 - member 객체와 findMember 객체가 동일한지 확인
//member 객체와 findMember 객체가 동일하다면 테스트는 성공
}
