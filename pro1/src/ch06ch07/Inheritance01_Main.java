package ch06ch07;

public class Inheritance01_Main {

	public static void main(String[] args) {
//		Human01 클래스의 객체 생성하여 필드, 메소드 호출
		Human01 obj01 = new Human01();
		
		//상위클래스 Animal01로부터 상속받은 필드와 매소드
		System.out.println(obj01);
		System.out.println(obj01.age);
		System.out.println(obj01.gender);
		System.out.println(obj01.intelligence);
		System.out.println(obj01.weight);
		System.out.println(obj01);
		System.out.println(obj01.age);
		System.out.println(obj01.gender);
		System.out.println(obj01.intelligence);
		System.out.println(obj01.weight);
		
		obj01.breath();
		obj01.eat();
		obj01.makeSound();
		obj01.move();
		
		//Human01 클래스에서 선언한 필드와 메소드 호출
		System.out.println(obj01.isConscience);
		System.out.println(obj01.ssn);
		obj01.work();
		
		//상위 클래스에서 상속받은 필드의 값은 변경
		System.out.println(obj01);
		System.out.println(obj01.age);
		System.out.println(obj01.gender);
		System.out.println(obj01.intelligence); //상속을 받으면 초기값을 덮어 씌운다
		System.out.println(obj01.weight);

		//상속 받은 메소드는 재 정의 -> 
		obj01.move(); //Human01의 
		
		System.out.println("\n---------------");
		
//		Cat01 클래스의 객체 생성하여 필드, 메소드 호출
		Cat01 obj02 = new Cat01();
	
		//상위클래스 Animal01로부터 상속받은 필드와 매소드
		System.out.println(obj02);
		System.out.println(obj02.age);
		System.out.println(obj02.gender);
		System.out.println(obj02.intelligence);
		System.out.println(obj02.weight);
		
		obj02.breath();
		obj02.eat();
		obj02.makeSound();
		obj02.move();

		//Cat01클래스에서 선언한 필드와 메서드호출
		System.out.println("obj02.variety="+obj02.variety);
		obj02.catchMouse();
		
		//상위 크래스 animal에서 상속받은 필드의 값의 변경
		System.out.println("obj02.age="+obj02.age);
		//상속받은 메서드는 재정의-> 재정의한 메서드호출
		obj02.move();

		System.out.println("\n---------------");
		
//		Butterfly01 클래스의 객체 생성하여 필드, 메소드 호출
		Butterfly01 obj03 = new Butterfly01();
		
//		Fish01 클래스의 객체 생성하여 필드, 메소드 호출
		Fish01 obj04 = new Fish01();
		
	}

}
