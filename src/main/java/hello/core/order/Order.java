package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice; //새로운 속성 추가

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = itemPrice; // 새로운 필드에 초기값을 설정
    }

    //비지니스 로직 추가 : 계산 로직 추가
    public int calculatePrice() {
        return itemPrice - discountPrice;
    }


    public Long getMemberId() {
        return memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    // 객체를 출력하면  toString 이 호출됨
    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}


// 주문 정보 저장 관리
// 주문한 회원의 아이디. 주문한 상품의 이름 , 주문한 상품의 가격 저장.,
// Order(Long memberId, String itemName, int itemPrice)
// ㄴ order객체가 생성될 때 호출됨 생성자는 memberId, itemName, itemName 의 값을 초기화 함
//
// Getter 메소드
// get()  memberId, itemName, itemName 각각의 값을 반환함
// Setter 메소드
//setMemberId(Long memberId): memberId 값을 설정 나머지도 마찬가지
//
// 하나의 주문에 대한 데이터를 캡슐화하는 것
// ㄴ 주문에 관련된 정보를 하나나의 객체로 묶어서 관리할 수 있도록 함
// 주문 생성, 주문 조회, 주문 수정 등의 기능 구현 시 사용하는 클래스