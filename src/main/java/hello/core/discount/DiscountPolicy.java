package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
//    @return 할인 대상 금액
//    결과로 얼마가 할인되었는지 리턴.
//    할인정책 구현체를 생성하러

    int discount(Member member, int price);
}
