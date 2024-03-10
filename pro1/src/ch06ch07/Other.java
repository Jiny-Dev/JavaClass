package ch06ch07;

public class Other {

	void method() {
		AccessModifier_p293 obj = new AccessModifier_p293();

		obj.pub = 200;
		obj.pro = 200;
		obj.pack = 200;
		//obj.pri = 200; private로 접근 불가
	}

}

class Other2 extends AccessModifier_p293{
	
	void method() {
		AccessModifier_p293 obj = new AccessModifier_p293();
		
		obj.pub = 200;
		obj.pro = 200;	
		obj.pack = 200;
		//obj.pri = 200; 클래스가 default로 자손이어도 객체가 private로 접근 불가
	}
	
}