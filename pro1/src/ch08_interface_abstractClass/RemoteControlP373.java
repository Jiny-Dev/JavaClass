package ch08_interface_abstractClass;

/*
[public] interface 인터페이스명 {
	//상수constant
	//[public static final] 타입 필드명[=초기값]
	int a = 100;
	public static final int b = 200;
	
	//생성자x -인터페이스명(){} //Interfaces cannot have constructors
	
	//추상메서드
	//[public abstract] 리턴유형 메서드명(매개변수리스트){}
	//기본적으로 interface의 메서드는 추상메서드로 인식
	//추상메서드는 body(몸체,구현부)를 가질 수 없다
	//public void test(){}//에러발생
	//Abstract methods do not specify a body
	void test1();
	public abstract void test2();
} */

public interface RemoteControlP373 {

	// 상수
	public static final int MAX_VOLUMN = 10;
	                         int MIN_VOLUMN = 0;

	// 추상메서드
	public void setVolumn(int volumn);
	public void turnOn();
	void turnOff();

	
	//자바8에 추가된 인터페이스의 새로운 멤버
	//인터페이스명.메소드명().인터페이스명을 이용하여 직접 호출 가능한 메소드
	//구현부{}가 있으므로 재정의를 할 수 없다. 
	
	//정적 메소드 -[public] static 리턴타입 메소드명(매개변수리스트){}
	static void changeBattery() {
		System.out.println("정적 메소드-changeBattery()");
	}
	
	//디폴트 메소드 -[public] default 리턴타입 메소드명(매개변수리스트){}
	//인터페이스에서 제공하는 기본 구현을 가진 메소드
	default void defaultMethod(){
		System.out.println("I'm defaultMethod()");
	}
	
	//차이점
	//static: 구현클래스에서 오버라이딩(재정의) 불가
	//default: 구현클래스에서 오버라이딩(재정의) 가능
}
