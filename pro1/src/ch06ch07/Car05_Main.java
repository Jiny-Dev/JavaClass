package ch06ch07;

//실행 클래스
public class Car05_Main {

	public static void main(String[] args) {
		Car05 myCar = new Car05();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = myCar.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 Tire 교체");
				myCar.frontLeftTire = new KumhoTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 Tire 교체");
				myCar.frontRightTire = new HankookTire("앞 오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 Tire 교체");
				myCar.backLeftTire = new HankookTire("뒤 왼쪽", 10);
				break;
			case 4:
				System.out.println("뒤 오른쪽 Tire 교체");
				myCar.backRightTire = new KumhoTire("뒤 오른쪽", 12);
				break;
			}// switch
			System.out.println("--------------------");
		}
	}
}