package ch08_interface_abstractClass;

//이 클래스는 판매, 구매 기능을 필요로 한 상점 클래스이다.
/*이 클래스는 Payment 인터페이스에 의존(dependency)한다.
  	=> 결합도를 낮춘다
	CreditCard 클래스, Cash 클래스, 00페이 클래스 등의 
	오버라이딩 메소드의 내용에 변경이 발생하더라도 영향을 받지 않는다.
	=> Shop 클래스에 미치는 영향이 적어진다(여기에는 없다)
	=> 개방-폐쇄 원칙을 적용하는 형태
*/
public class Shop {
	//field
	private Payment payment; //null
	
	//constructor-field 초기화
	public Shop() {
		this.payment = payment;
	}
	
	//method
	public void purchase(int amount) {
		payment.pay(amount);
	}
	
}
