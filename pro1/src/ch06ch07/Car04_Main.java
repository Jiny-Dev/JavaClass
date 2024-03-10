package ch06ch07;
//이 클래스는 Car04의 실행 클래스리다.
public class Car04_Main {
	public static void main(String[] args) {
		//Car04를 실행하기 위한 객체 생성
		Car04 myCar = new Car04();
		int originGas = myCar.getGas();
		System.out.println("초기 gas"+originGas);
		
		//가스주입
		myCar.setGas(3);
//		myCar.isLeftGas();
		boolean r = myCar.isLeftGas();
		
		//차량운전
		myCar.run();//run 메소드 종료
		System.out.println("run() 실행 후");
		
	}

}
