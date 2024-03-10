package ch06ch07;
/*
*this: 자기 객체 참조변수
=> this.필드명 this.필드=값 this.메소드명()
*this(): 자신의 또 다른 생성자 호출
*
*super: 부모 객체 참조변수
=> super.필드명 super.필드=값 super.메소드명()
*super(): 부모 생성자 호출


*/
//Inheritance02.java => compile => Inheritance02.class
public class Inheritance02 { //파일명과 같은 클래스만 public
	
}

class Grandmother02{
	String name = "할머니 이름";
	
	Grandmother02(){
		System.out.println("Grandmother02()-기본생성자");
	}
	Grandmother02(int a){
		System.out.println("Grandmother02-생성자 a= "+a);
	}
}


class Mother02 extends Grandmother02{
	String name = "엄마 이름";
	//엄마 이름을 주석처리 하면 할머니 이름이 나온다
	
//	Mother02(){
//		System.out.println("Mother02()-기본생성자");
//	}
	Mother02(int a){ //기본 생성자가 아니게 된다 //묵시적으로 기본생성자가 아니기 때문에 호출되지 않았다
		super(a*2); //Dougher02가 준 것을 그대로 Grandmother02로 넘긴다 
		System.out.println("Mother02(int1개)생성자야 a= "+a);
	}
	//method
	void sing() {
		System.out.println("Mother02의 sing()");
	}
	
}


//Inheritance02.java => compile => Daugher02.class
//별도의 java 파일이 없어도 컴파일 되면 class 파일이 형성된다.
class Daugher02 extends Mother02{
	String name = "딸 이름";//
	//딸 이름을 주석처리 하면 엄마 이름이 나온다
	
	//field
	
	
	//constructor
	//자식 클래스의 기본생성자는 묵시적으로 부모클래스의 기본생성자를 호출
	Daugher02(){
		//super(); //부모클래스의 기본 생성자를 호출 //파라미터가 없는 기본 생성자
		//new Mother02(); => super(); //생성자 호출한 것임 
		//super();가 생략되어 있으며 없어도 실행됨
		super(100); //자식상속자에서 인트 값을 주어 부모 클래스의 파라미터 생성자를 불러올 수 있음 
		System.out.println("Daugher02()-기본생성자");
	}
	//method
	void method() {
		System.out.println("딸method() this.name="+this.name);
		System.out.println("딸method() super.name="+super.name);
		//딸이 가지고 있으나 엄마가 나옴, super는 일종의 참조변수 역할을 하여 주소를 저장함 
	}
	void method1() {
		super.sing();
	}
	
	
}