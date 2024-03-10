package ch11;

/*Math(p504)
- 수학 계산을 사용할 수 있는 필드와 매소드 제공
- 클래스명.필드명				예)Math.PI
   클래스명.메소드명();     예)Math.random()

*/
public class MathEx01_p504 {

	public static void main(String[] args) {
		
		//Math.PI: 3.141592653589793
		double pi = Math.PI;
		System.out.println(pi);
		
//		System.out.println(Math.PI); //필드로 데이터가 미리 저장되어 있다
		
System.out.println("_______________________");
		
		//Math.random(): 00이상 1.0이상의 실수 형태의 난수 발생
		for(int i=1; i<=5;i++) {
//				double rnd = Math.random()+1;
				int rnd = (int)Math.random()+1;
				System.out.println(rnd);
		}
		

		//start부터 시작하면 n개의 정수중에서 임의 정수 구하기
//		(int)(Math.random()*6)+start;
		
System.out.println("_______________________");
		
		//주사위: 1부터 6개의 정수 중에서 임의 구하기
		System.out.println((int)(Math.random()*6)+1);
		System.out.println((int)(Math.random()*6)+1);
		System.out.println((int)(Math.random()*6)+1);
		System.out.println((int)(Math.random()*6)+1);
		System.out.println((int)(Math.random()*6)+1);
		System.out.println((int)(Math.random()*6)+1);
		
System.out.println("_______________________");

		//로또: 1~45
		for(int i=1; i<=6;i++) {
			int lo =(int)(Math.random()*45)+1;
			System.out.println(lo+"번");
		}
		
System.out.println("_______________________");

		//abs(): + 양수 구하기
		System.out.println("Math.abs(-100)="+Math.abs(-100));
		System.out.println("Math.abs(100)="+Math.abs(100));
		System.out.println("Math.abs(pi)="+Math.abs(pi));
		
		//ceil(): 올림 값 
		System.out.println("Math.ceil(pi)="+Math.ceil(pi));
		System.out.println("Math.ceil(-3.934)="+Math.ceil(-3.934));//-3.0
		
		//floor(): 내림 값
		System.out.println("Math.floor(pi)="+Math.floor(pi));
		System.out.println("Math.floor(-3.934)="+Math.floor(-3.934));//-4.0
		
		//round(): 반올림
		System.out.println("Math.round(pi)="+Math.round(pi));
		System.out.println("Math.round(3.4)="+Math.round(3.4));
		System.out.println("Math.round(3.45)="+Math.round(3.45));//3: java에서는 무조건 소수점 첫째자리에서 반올림
		System.out.println("Math.round(3.5)="+Math.round(3.5));
		
		
	}

}
