package ch08_interface_abstractClass;

//P375
//이 클래스는 RemoteControlP373 인터페이스의 구현클래스이다.
//class 클래스명 implements 인터페이스명1, 인터페이스명n{}
//상속은 부모클래스가 하나인 단일상속이지만 인터페이스는 여러개를 inherited하여 다수 사용할 수 있다.
//class 클래스명 [extends 상위클래스] implements 인터페이스명1, 인터페이스명n{} //다음과 같이 사용할 수 잇다.
public class AudioP375 implements RemoteControlP373 {

	// 보이지는 않지만 inherited contant가 존재
	public int volumn;

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
		System.out.println("AudioP375-turnOn()");
	}

	@Override
	public void turnOff() {
		System.out.println("AudioP375-turnOff()");
	}

}
