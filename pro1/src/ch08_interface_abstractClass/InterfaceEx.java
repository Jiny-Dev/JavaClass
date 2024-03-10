package ch08_interface_abstractClass;

public interface InterfaceEx {
	//상수-constant
	//[public static final] 타입 필드명[=초기값] => [public static final] 다음과 같이 지정하며 인터페이스에서는 생략되어있다.
	int a = 100; // static이 붙은 키워드는 텍스트가 기울어짐
	public static final int b = 200;
	
	
	//생성자를 가질 수 없음 -RemoteControlP373(){} //Interfaces cannot have constructors
	
	/*일반 메소드 -[접근제한자] [modifier] 리턴유형 메소드명(매개변수 리스트) {} => error
	   public void test() {} //Abstract methods do not specify a body 
	   기본적으로 interface의 메소드는 추상메소드로 인식하며
	   추상메소드는 body(몸체, 구현부)를 가질 수 없다.*/
	
	//추상메소드
	void test1(); // 접근제한자(항상 public) 제한자(abstract) 리턴유형 메소드명();
	public abstract void test2(); // 위처럼 앞의 접근제한자와 제한자가 고정이기 때문에 생략 가능
	
}
