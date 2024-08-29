package hello.core.order;

public interface OrderService {
   Order createOrder(Long memberId, String itemId, int itemPrice, String itemName);
   //최종 주문 결과를 반환함(인터페이스 ) 다음 주문 구현체 생성
}
