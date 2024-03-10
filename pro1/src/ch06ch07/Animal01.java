package ch06ch07;
/*상속(Inheritance)이란? p310
*현실 세계: 
-부모가 자식에게 물려주는 행위
-부모가 자식을 선택해서 물려줌

*객체 지향 프로그램: 
-자식(하위, 파생) 클래스가 부모(상위) 클래스의 멤버를 물려받는 것
-자식이 부모를 선택해 물려받음
-상속 대상: 부모의 필드와 메소드

*상속(Inheritance) 개념의 활용
*상속의 효과
-부모 클래스 재사용해 자식 클래스 빨리 개발 가능
-반복된 코드 중복 줄임
-유지 보수 편리성 제공
-객체 다형성 구현 가능
-자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화블럭 제외)
-자손의 멤버개수는 조상보다 적을 수 없다.(같거나 많다.)
-공통부분은 조상에서 관리하고 개별부분은 자손에서 관리한다
-조상의 변경은 자손에 영향을 미치지만, 자손의 변경은 조상에 아무런 영향을 미치지 않는다.

*클래스간의 관계 – 포함관계(composite)
*포함(composite)이란?
- 한 클래스의 멤버변수로 다른 클래스를 선언하는 것
- 작은 단위의 클래스를 먼저 만들고, 이 들을 조합해서 하나의 커다란 클래스를 만든다.

*클래스간의 관계결정하기 
- ‘is-a’와 ‘has-a’를 가지고 문장을 만들어 본다.
- 상속관계: 원(Circle)은 도형(Shape)이다.
          Circle is a Shape 
- 포함관계: 원(Circle)은 점(Point)를 가지고 있다.
          Circle has a Point
*부모클래스 = 상위클래스 = super클래스
*자식클래스 = 하위클래스 = sub클래스

*상속 대상 제한
-부모 클래스의 private 접근 갖는 필드와 메소드 제외
-부모 클래스가 다른 패키지에 있을 경우, 
 default 접근 갖는 필드와 메소드도 제외

*extends 키워드
-자식 클래스가 상속할 부모 클래스를 지정하는 키워드
-자바는 단일상속(single inheritance)만을 허용한다.(C++은 다중상속 허용)
-문법>자식클래스명 extends 부모클래스명{}

*메소드 재정의(@override)(p317)
메소드 위, 부모 클래스의 상속 메소드를 수정하여 자식 클래스를 재 정의한 것


*메소드 재정의 dhqjfhem 조건
조건 1. 부모 클래스의 메소드와 동일한 시그니처를(리턴유형, 메소드명, 매개변수) 가져야 한다.	
조건 2. 접근제한을 더 강하게 오버라이딩 불가
-public을 default나 private로 수정 불가능
-반대로 default는 public으로 수정 가능
조건 3. 	

*/
public class Animal01 {

		//field - 속성(명사)
		//나이
		int age = 0;
		//지능
		int intelligence = 0;
		//무게
		double weight = 0.0;
		//성별
		String gender = null;
		
		//method - 기능, 동작(동사)
		//움직이다
		void move() {
			System.out.println("Animal의 move()");
		}
		//먹는다
		void eat() {
			System.out.println("Animal의 eat()");
		}
		//숨쉰다
		void breath() {
			System.out.println("Animal의 breath()");
		}
		//소리를 낸다
		void makeSound() {
			System.out.println("Animal의 makeSound()");
		}
	
}
