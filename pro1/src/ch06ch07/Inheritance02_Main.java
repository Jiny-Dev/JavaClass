package ch06ch07;

public class Inheritance02_Main {

	public static void main(String[] args) {

		//Mother02의 클래스 객체 생성
//		Mother02 m = new Mother02();
		//Mother을 주석 처리해도 상속 관계에 의해 아래 Dougher02에서 출력된다
		
		//Daugher02의 클래스 객체 생성 
		Daugher02 d = new Daugher02();
		System.out.println(d.name);
		d.method();
		d.method1();
	}// 메인 스레드가 끝나면 프로그램 종료

}
