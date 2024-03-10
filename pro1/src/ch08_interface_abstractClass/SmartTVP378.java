package ch08_interface_abstractClass;

//P374
//이 클래스는 RemoteControlP373 인터페이스의 구현클래스이다.
//class 클래스명 implements 인터페이스명1, 인터페이스명n{}
//상속은 부모클래스가 하나인 단일상속이지만 인터페이스는 여러개를 inherited하여 다수 사용할 수 있다.
//class 클래스명 [extends 상위클래스] implements 인터페이스명1, 인터페이스명n{} //다음과 같이 사용할 수 잇다.
public class SmartTVP378 implements RemoteControlP373, SearchableP378 {

	// 보이지는 않지만 inherited contant가 존재
	public int volumn;
	
/*	//@Override => 인터페이스를 재정의한 것이 아닌 새롭게 추가한 메소드로 인식해 오버라이딩 오류메세지가 발생
	public static void changBattery() {
		System.out.println();
	}
*/
	
	
// The type TVP374 must implement
// the inherited abstract method RemoteControlP373.setVolumn(int)
// the inherited abstract method RemoteControlP373.turnOn()
// the inherited abstract method RemoteControlP373.turnOff()
// 추상 메소드의 다음을 재정의 하여라.

	@Override
	public void setVolumn(int volumn) {

		if (volumn > RemoteControlP373.MAX_VOLUMN) { // 100>10
			this.volumn = RemoteControlP373.MAX_VOLUMN; // this.volumn = 10; //10보다 큰 값을 넣으면 그냥 10으로 한다.
		} else if (volumn < RemoteControlP373.MIN_VOLUMN) { // -100<0
			this.volumn = RemoteControlP373.MIN_VOLUMN; // this.volumn = 0; //0보다 작은 값을 넣으면 그냥 0으로 한다.
		} else {
			this.volumn = volumn; // 받은 필드명이 메소드명과 구분되도록 this.
		}

	}

	@Override
	public void turnOn() {
		System.out.println("SmartTVP378-turnOn()");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTVP378-turnOff()");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "검색.");
	}

	@Override
	public void defaultMethod() { //default가 사라지고 public이 부여 된다.
		//RemoteControlP373.super.defaultMethod();
		System.out.println("구현클래스에서 재정의한 defaultMethod()");
	}
	
	

}
