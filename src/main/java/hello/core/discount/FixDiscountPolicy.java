package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; //    무조건 1000원 할인

    // 조건 ㅣ VIP 등급
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            //enum 타입은 == 사용이 맞다
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
