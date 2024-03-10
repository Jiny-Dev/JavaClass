package ch08_interface_abstractClass;

//이 클래스는 Payment 인터페이스의 구현클래스이다.
public class CreditCard implements Payment {
	//카드사
	//유효기간
	//
	
	
	@Override
	public void pay(int amount) {
		System.out.println(amount+"원을 신용카드로 결제합니다.");
	}

}
