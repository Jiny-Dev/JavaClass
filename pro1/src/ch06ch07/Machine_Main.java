package ch06ch07;

//이 클래스는 Machine 클래스의 실행 클래스
//instanceof 사용(p350): 객체 타입 변환
//상위클래스타입의 참조변수에는 하위클래스의 객체가 들어갈 수 잇으므로
//강제타입변환을 하기 이전
//참조변수에 들어간 객체의 타입을 확인하는 것이 좋다.
// => 객체가 어떤 타인인지 조사할 때 사용
public class Machine_Main {

	public static void main(String[] args) {

		// Machine 클래스 객체 생성
		Machine machine = new Machine();
		machine.turnOnOff();

		// HandPhone 클래스 객체 생성
		HandPhone handPhone = new HandPhone();
		handPhone.call();

		// CoffeeMachine 클래스 객체 생성
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		coffeeMachine.extractCoffee();

		// machine에 생성한 HandPhone 클래스 객체 주소 할당
		machine = handPhone; // new HandPhone();
		handPhone.turnOnOff(); // 상속받아 사용 가능
		// 본래 결과 Machine-turnOnOff => @Override를 통해 HandPhone-turnOnOff 출력
//		machine.call(); //상위클래스의 필드, 메소드만 사용 가능

		// 강제 타입 변환
		HandPhone handPhone1 = (HandPhone) handPhone;
		handPhone1.call();

		// machine에 생성한 CoffeeMachine 클래스 객체 주소 할당
		machine = coffeeMachine; // new CoffeeMachine();
		coffeeMachine.turnOnOff(); // 상속받아 사용 가능
		// 본래 결과 Machine-turnOnOff => @Override를 통해 CoffeeMachine-turnOnOff 출력
//		machine.extractCoffee(); //상위클래스의 필드, 메소드만 사용 가능

		// 시간이 지나면 machine 안에 handPhone이 들었는지 coffeeMachine이 들었는지 알 수 없다.
		// instanceof 사용
		if (machine instanceof HandPhone) {
			// 강제 타입 변환
			HandPhone handPhone2 = (HandPhone) machine;
			handPhone2.call();
		}else if(machine instanceof Tel) {
			Tel t1 = (Tel)machine;
			System.out.println(t1.name);
			System.out.println(((Tel)machine).name); //위 두줄의 코드를 한 줄로 바꾸기
		}

		System.out.println("----------------------------------");

		// machine의 turnOnOff(); 결과는 무엇이 나올까
		machine.turnOnOff(); // 마지막에 machine = coffeeMachine;에 의해 오버라이딩 되어 덮어 씌워졌다. 오버라이딩 된 메소드 호출

		Tel t = new Tel();
		t.turnOnOff(); // 유선 Tel의 전원 키고 끄기
		machine = t;
		machine.turnOnOff(); // 유선 Tel의 전원 키고 끄기
		//Machine 클래스에서 출발하여
		//t차입의 참조클래스인 Tel클래스까지 내려가면서
		//마지막으로 오버라이딩된 turnOnOff()를 호출하게된다.
		//자바는 단일 상속만을 허용하므로 계층 추적할 수 있다.
		
		
	}

}
