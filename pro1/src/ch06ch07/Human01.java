package ch06ch07;

//모든 클래스는 Object를 상속 받고 있다.
//public class Human01 extends Object{
public class Human01 extends Animal01{ //extends Animal01(부모 클래스를 상속받는다)
	//field
	int intelligence = 150; //지능
	boolean isConscience = true; //양심
	String ssn = "000000-0000000"; //주민번호
	
	//method
	void work() { //일하다
		System.out.println("Human01-work()");
	}
	
	//재정의
	@Override //메소드 위, 부모 클래스의 상속 메소드를 수정하여 자식 클래스를 재 정의한 것
				   //부모 클래스의 메소드와 동일한 시그니처를 가져야 한다.	
	void move() { //움직이다
		System.out.println("Human01의 move(): 이족보행");
	}

	
}
