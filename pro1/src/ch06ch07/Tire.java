package ch06ch07;

//p340
//이 클래스는 자동차 Car05 클래스의 부품 클래스이다
public class Tire {

	// field
	String location; // 타이어의 위치
	int maxRotation; // 최대 회전 수(타이어 수명)
	int accumulateRotation;// 누적 회전 수

	// constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		System.out.println(location+" <= new Tire");
	}

	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("😩😩😩" + location + "Tire 펑크");
			return false;
		}

	}

}
