package ch06ch07;

//p341
public class Car05 {

	// field
	Tire frontLeftTire = new Tire("앞 왼쪽", 6); // 앞 왼쪽 타이어
	Tire frontRightTire = new Tire("앞 오른쪽", 2); // 앞 오른쪽 타이어
	Tire backLeftTire = new Tire("뒤 왼쪽", 3); // 뒤 왼쪽 타이어
	Tire backRightTire = new Tire("뒤 오른쪽", 4); // 뒤 오른쪽 타이어

	// constructor

	// method

	public int run() {
		System.out.println("Car05 running()");
		if (frontLeftTire.roll() == false) { // 앞 왼쪽 타이어 문제
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) { // 앞 오른쪽 타이어 문제
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) { // 뒤 왼쪽 타이어 문제
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) { // 뒤 오른쪽 타이어 문제
			stop();
			return 4;
		}
		return 0;
	}

	public void stop() {
		System.out.println("Car05 stop()");
	}

}
