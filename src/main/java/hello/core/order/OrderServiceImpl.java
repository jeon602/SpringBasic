package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemId, int itemPrice, String itemName) {
        Member member = memberRepository.findById(memberId);
        int disCountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, disCountPrice);
    }
}

//* 주문을 생성하는 기능 구현
// OrderServiceImpl 클래스는 OrderService 인터페이스를 구현한 클래스
// 회원리포 인터페이스 구현체 메모리회원리포를 사용해 회원 정보를 메모리에 저장하고 관리
// 할인정책 구현체인 FixDisCountPolicy사용으로 고정 금액 할인 정책 적용 *//
//* creatOrder 메소드 호출하면 멤버 아이디를 사용해 회원정보 조회
// 회원 정보를 기반으로 지정된 할인 정책을 통해 상품의 할인가 계산
// 주문 객체를 생성해 반환함 이때 회원 아이다,상품이름 원래 가격, 할인 후 가격이 포함
//OrderServiceImpl: 고정 멤버 저장소와 할인 정책을 사용하고 있음 *//

// 메모리 회원 리포와 고정 할인 정책을 구현체로 생성해서 사용하고 있음