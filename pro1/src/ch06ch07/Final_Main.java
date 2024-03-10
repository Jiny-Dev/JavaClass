package ch06ch07;

public class Final_Main {

	public static void main(String[] args) {
		//GrandFather01 객체 생성
		GrandFather01 gf = new GrandFather01();
		System.out.println("gf.money= "+gf.money); //50
		System.out.println("gf.job= "+gf.job); //의사
		gf.gfmethod1();
		
		gf.drive();
		gf.sing();
		
		//Father01 객체 생성
		Father01 f = new Father01();
		System.out.println("f.money= "+f.money);
		System.out.println("f.job= "+f.job);
		
		f.drive();
		f.sing(); //GrandFather01의 final sing에 의해 트로트 출력
	}
}

