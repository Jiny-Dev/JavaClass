package etc;

import ch06ch07.AccessModifier_p293;

public class Other3 {

	void method() {
		AccessModifier_p293 obj = new AccessModifier_p293();

		obj.pub = 200;
		//obj.pro = 200; protected로 자손으로 부모로부터 물려 받았으나 참조를 통해 접근하였기에 불가
		//obj.pack = 200; default로 소속 패키지가 달라서 불가
		//obj.pri = 200; private로 접근 불가
	}
	
}

class Other2 extends AccessModifier_p293{
	
	void method() {
		AccessModifier_p293 obj = new AccessModifier_p293();
		pro = 300; //protected로 패키지가 다르지만 부모로부터 물랴받은 자손이어서 허용
		
		obj.pub = 200;
		//obj.pro = 200;	
		//obj.pack = 200;
		//obj.pri = 200; 클래스가 default로 자손이어도 객체가 private로 접근 불가
	}
	
}