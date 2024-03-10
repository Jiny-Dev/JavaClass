package ch08_interface_abstractClass;

//이 클래스는 Payment 인터페이스의 구현클래스이다.
public class Cash implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println(amount+"을 현급으로 결제합니다.");
	}
	
}
