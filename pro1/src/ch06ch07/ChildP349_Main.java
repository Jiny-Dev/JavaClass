package ch06ch07;

//이 클래스는 ChildP349의 실행 클래스
//객체간의 타입 변환
/*자동타입변환(promotion): 상위 클래스 => 하위 클래스
   클래스타입 참조변수 = new 클래스();
   상위클래스 참조변수 = new 하위클래스();
   //상위클래스 타입의 참조변수에 하위클래스의 객체가 할당
    자식타입이 부모타입으로 자동타입변환하면
    부모에서 선언된 필드와 메서드만 사용 가능!!(p348)
   
 *강제타입변환(casting): 하위클래스 => 상위클래스
   클래스타입 참조변수 = new 클래스();
   상위클래스 상위클래스참조변수 = new 하위클래스();
   하위클래스 = 하위클래스참조변수 = (하위클래스)상위클래스참조변수; 
   만약 자식에 선언된 필드와 메서드를 사용하고 싶다면,
   강제타입변환을 해서
   다시 자식타입으로 변환한 다음
   자식에서 선언된 필드와 메소드를 사용하면 된다.(p348)
*/

public class ChildP349_Main {

	public static void main(String[] args) {
		ParentP349 parent = new ParentP349();
		parent.ssn = "800216-1234567";
		parent.drive();
		parent.sojuDrink();

		ChildP349 child = new ChildP349();
		child.allowance = 50000;
		child.vacation();

		// 상위클래스 참조변수 = new 하위클래스();
		// 상위클래스타입의 참조변수에 하위클래스의 객체가 할당
		// ParentP349타입의 참조변수 parent1에 하위ChildP349클래스의 객체가 할당
		ParentP349 parent1 = new ChildP349();
		/*
		 * 자식타입이 부모타입으로 자동타입변환하면 부모에서 선언된 필드와 메서드만 사용 가능!!
		 */
		System.out.println(parent1.ssn);
		parent1.drive();
		parent1.sojuDrink();
//		System.out.println(parent1.allowance); //allowance cannot be resolved or is not a field
//		parent1.vacation(); //The method vacation() is undefined for the type ParentP349

		/*
		 * 만약 자식에 선언된 필드와 메서드를 사용하고 싶다면, 강제타입변환을 해서 다시 자식타입으로 변환한 다음 자식에서 선언된 필드와 메소드를
		 * 사용하면 된다.
		 */
		// parnt1참조변수에 할당된 주소가 ChildP349 클래스의 객체이니?
		// parent1 매개변수가 참조하는 객체가 ChildP349인지 조사
		// 매개변수의 다형성에서 많이 활용
		if (parent1 instanceof ChildP349) {
			System.out.println("parent1은 ChildP349의 인스턴스입니다.");
			ChildP349 child1 = (ChildP349) parent1;
			System.out.println(child1.allowance);
			child1.vacation();

			// 상속받은 필드와 메소드
			System.out.println(child1.ssn);
			child1.drive();
		} else {
			System.out.println("parent1참조변수에는 객체가 할당x");
		}
	}

}
