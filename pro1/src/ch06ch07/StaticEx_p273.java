package ch06ch07;

public class StaticEx_p273 {
/*클래스의 멤버 구성
해당 클래스도 클래스 이기 때문에 스스로를 생성하고 사용할 수 있다.

field - data
[access modifier] [modifier] 타입 필드명[=초기값];
인스턴스 멤버 - 객체가 생성될 때 메모리에 할당

constructor - 생성자
[modifier] 클래스명(argument 리스트){}
*/
StaticEx_p273(){
	System.out.println("StaticEx_p273() 기본 생성자야");
}

/*
method - 기능
[access modifier] [modifier] 리턴타입 메소드명(argument 리스트){}*/
	int v1 = 100; //인스턴스 필드
	static double v2 = 100.9;//static 필드, 정적 필드
	
	void method01() { //인스턴스 메소드
		System.out.println("method01() 입니다");
	}
	static void method02() {//static 메소드, 정적 메소드
		System.out.println("method02() 입니다");
	}
	
	
	//클래스가 로딩될 때 메모리에 할당 - static 메소드, 정적 메소드
	public static void main(String[] args) { //메모리에 이미 올라간 상태
		System.out.println(StaticEx_p273.v2);
		StaticEx_p273.method02();

		System.out.println(v2);
		method02();
		
//		System.out.println(v1);
//		Cannot make a static reference to the non-static field v1
//		method01();
//		Cannot make a static reference to the non-static method method01() from the type StaticEx_p273
	
		//StaticEx_p273 클래스의 객체를 생성
		StaticEx_p273 obj = new StaticEx_p273();
		System.out.println("obj= "+obj);		
		
		//객체가 생성될 때 메모리에 할당
		//필드에 접근
		System.out.println(obj.v1);
		
		//또 다른 메소드 호출
		obj.method01();
		
		
	}

}
