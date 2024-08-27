package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
//멤버 서비스에대한 구현체 생성

//구현 객체를 만들어줘야 함
//
//@Override
//public void join(Member member) {
//    memberRepository.save(member);
//} 조인해서 세이브 호출 시, 다형성에 의해 메모리멤버리포에 있는 인터페이스가 아닌
//    세이브가 호출된다.