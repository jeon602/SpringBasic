package hello.core.member;

//회원가입과 조회 기능
public interface MemberService {
    void join(Member member);
    //가입 기능
    Member findMember(Long memberId);
    //조회 기능
}
