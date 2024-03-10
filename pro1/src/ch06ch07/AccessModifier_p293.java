package ch06ch07;

/*접근 제어자(access modifier)-p293
-멤버 또는 클래스에 사용되어, 외부로부터의 접근을 제한한다
-public:ㅣ 자유롭게 사용 가능
-protected(p325):상속과 관련된 접근 제한자
	같은 패키지: default와 동일
	다른 패키지: 자식 클래스만 접근 허용
-default: 동일 패키지 내부에서만 접근 허용
-private: 동일 클래스 내부에서만 접근 허용

*public|default class 클래스명{}
*public|protected|default|private 타입 필드명;
*public|protected|default|private 리턴타입 메소드명(){}
*public|protected|default|private 생성자명(){}
-일반적으로 생성자의 접근제어자는 클래스의 접근자와 일치한다.
-생성자에 접근제한자를 이용함으로써 인스턴스의 생성을 제한할 수 있다.
-default는 접근자를 적지 않으면 자동 적용이다.

*접근 제어자를 이용한 캡슐화<=접근제한자를 사용하는 이유
-외부로부터 데이터를 보호하기 위해
-외부에는 불필요한, 내부적으로 사용되는, 부분을 감추기 위해
*/

public class AccessModifier_p293 {
	// public|protected|default|private 타입 필드명;
	public int pub = 100;
	protected int pro = 100;
	int pack = 100;
	private int pri = 100;

	void method() {
		pub = 200;
		pro = 200;
		pack = 200;
		pri = 200;
	}
}
