package ch06ch07;

public class Machine {

	public void turnOnOff() {
		System.out.println("Machine-turnOnOff");
	}

}

class Tel extends Machine { // 유선전화 //추후 추가해서 Machine => Tel => HandPhone을 만들었다.

	String name = "세련된 유선 전화기";
	@Override
	public void turnOnOff() {
		System.out.println("Tel-turnOnOff");
	}

}

class HandPhone extends Tel { // 무선전화

	public void call() {
		System.out.println("HandPone-call()");
	}

	@Override
	public void turnOnOff() {
		System.out.println("HandPhone-turnOnOff");
	}

}

class CoffeeMachine extends Machine {

	public void extractCoffee() {
		System.out.println("CoffeeMachine-extract()");
	}

	@Override
	public void turnOnOff() {
		System.out.println("CoffeeMachine-turnOnOff");
	}

}
