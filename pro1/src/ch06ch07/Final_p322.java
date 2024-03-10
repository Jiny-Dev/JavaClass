package ch06ch07;
/*final 키워드의 용도
-final 필드: 수정 불가 필드
-final 크래스: 부모로 사용 불가한 클래스
-final 메소드: 자식이 재정의할 수 없는 메소드 

*상속할 수 없는 final 클래스
-자식 클래스 만들지 못하도록 final 클래스로 생성

*오버라이딩 불가한 final 메소드
-자식 클래스가 재정의 못하도록 부모 클래스의 메소드를 final로 생성
*/

public class Final_p322 {
	

}

class GrandFather01{
	//field
	int money = 50;
	final String job = "의사";
	//method
	void gfmethod1() {
		money = 55;
		//job = "명의"; //위 final로 정의 되어 수정 불가
		System.out.printf("fmethod1() money = %d, job=%s\n", money, job); //job 앞에 this.이 생략되어 있다
	}
	void drive() {
		System.out.println("GrandFather01-drive()");
	}
	final void sing() {
		System.out.println("트로트 해요");
	}
}

final class Father01 extends GrandFather01{
	//field
	int money = 100;
	String job = "수의사";
	//method
	@Override
	void drive() {
		System.out.println("Father01-drive()");
	}
//	@Override
//	void sing() {
//		System.out.println("데스메탈 해요");
//	}
}

//class Sun01 extends Father01{
//	The type Sun01 cannot subclass the final class Father01
//}