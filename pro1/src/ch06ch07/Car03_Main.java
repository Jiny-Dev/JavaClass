package ch06ch07;
//이 클래스는 Car03 클래스의 실행클래스
public class Car03_Main {

	public static void main(String[] args) {
		//객체생성
		Car03 myCar01 = new Car03();
		
		//자동차 시동 -> 속도 확인 -> 증속 -> 확인 -> 감속 -> 확인 -> 시동 종료 
		myCar01.powerOn();
		myCar01.showCurrSpeed();
		
		myCar01.speedUp();
		myCar01.speedUp();
		myCar01.speedUp();
		myCar01.showCurrSpeed(); //아래와 같이 표현할 수 있다.
//		int s = myCar01.speedUp();
//		System.out.println(s);		
		
		myCar01.speedDown();
		myCar01.speedDown();
		myCar01.showCurrSpeed(); //아래와 같이 표현할 수 있다.
//		int ss =myCar01.speedDown();
//		System.out.println(ss);		

		myCar01.speedDown2(); //감속 + 현재 속도 조회
		
		myCar01.changeDir("우측"); //방향 전환
		myCar01.changeDir('우'); //방향 전환
		myCar01.changeDir("좌측");
		myCar01.changeDir('좌');
		myCar01.changeDir("저승"); 

		System.out.println(myCar01.changeDir2(4));

		myCar01.powerOff();
	}
	
}