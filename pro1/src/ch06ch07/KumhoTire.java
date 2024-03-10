package ch06ch07;

//p340
//이 클래스는 자동차 Car05 클래스의 부품 클래스인 Tire 클래스의 자식클 래스이다.
public class KumhoTire extends Tire {

	// field

	// constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		System.out.println(location+": KumhoTire");
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("**" + location + "KumhoTire 펑크");
			return false;
		}

	}

}
