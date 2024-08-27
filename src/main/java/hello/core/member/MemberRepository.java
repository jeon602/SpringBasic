package hello.core.member;

public interface MemberRepository {
    //회원 저장소 다음 회원 구현체 생성하러
    void save(Member member);
    //멤버 저장
    Member findById(String memberId);
    //회원의 아이디로 회원 조회 기능
}
