package ch08_interface_abstractClass;

/*이 클래스는 
 interface RemoteControlP373
 interface SearchableP378
 즉, 다중인터페이스를 구현한 클래스이다.
*/
public class RemoteControlEx_Main {

	public static void main(String[] args) {

//		클래스타입 참조변수 = new 클래스();
//		상위클래스 참조변수 = new 하위클래스();
//	    인터페이스 참조변수 = new 구현클래스(); //인터페이스를 implements 하고 있는 구현 클래스 사용 // 인터페이스 참조변수 = new 인터페이스(); //error 인터페이스() 생성자를 가질 수 없다.
		
//이 클래스는 interface RemoteControlP373, 의 필드와 기능을 사용하는 클래스이다.
		//RemoteControlP373 rc = null;
		RemoteControlP373 rc = new AudioP375();
		AudioP375 au = (AudioP375) rc; // 강제타입변환
		
		rc.turnOn();
		rc.setVolumn(9);
		System.out.println("setVolumn(123) = " + au.volumn);
		rc.turnOff();
		
		
		rc = new TVP374();
		rc.turnOn();

		// rc.volumn; //자식의 것과 같기 때문에 가져올 수 없어 다음과 같이 타입변환 한다.
		TVP374 tv = (TVP374) rc; // 강제타입변환

		rc.setVolumn(123);
		System.out.println("setVolumn(123) = " + tv.volumn);

		rc.setVolumn(-10);
		System.out.println("setVolumn(-10) = " + tv.volumn);

		rc.setVolumn(5);
		System.out.println("setVolumn(5) = " + tv.volumn);

		rc.turnOff();
		//외부에서 interface의 기능을 호출하면
		//interface의 메소드를 호출
		//but 내부적으로는 interface의 구현클래스의 구현메소드가 호출동작된다.
		
		
		System.out.println("=====================");
		
//이 클래스는 interface SearchableP378 기능을 사용하는 클래스이다.
		
		SearchableP378 sc = new SmartTVP378();
		sc.search("네이버");
		sc.search("http://naver.com");
		sc.search("프로토콜://ip주소:포트번호/컨텍스트패스/디렉토리");      //프로토콜: 통신규약(즉, 약속)
		
		RemoteControlP373 rc0 = new SmartTVP378(); //클래스 생성
		rc0.turnOn();
		rc0.turnOff();
		
		
		System.out.println("=====================");

		//RemoteControlP373 인터페이서의의 static 메소드 사용하기
		RemoteControlP373.changeBattery();
		SmartTVP378 s =new SmartTVP378();
		//s. => 일반 클래스와 다르게 참조변수 명을 통해서는 접근 불가
		//인터페이스만 보이고 뒤의 객체는 보이지 않기 때문
		s.defaultMethod(); 
		//오버라이딩 전: "I'm defaultMethod()"
		//오버라이딩 후: "구현클래스에서 재정의한 defaultMethod()"
		
		//인터페이스명을 통해서는 불가하다
	
	}

}
