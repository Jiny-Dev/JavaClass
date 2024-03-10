package ch11;

import java.util.Random;

/*
Java의 Random 클래스 
-의사 난수 스트림을 생성하는데 사용한다.
*/
public class RandomEx {

	public static void main(String[] args) {
		
		System.out.println("Random 클래스 이용");
		Random random= new Random();
		for(int i=1; i<=10; i++) {
			boolean r = random.nextBoolean();
			System.out.print(r+",");
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			double r = random.nextDouble(100);//() 안의 수는 곧 범위를 나타낸다.0~99까지에서 
			System.out.print(r+",");
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			int r = random.nextInt(100);
			System.out.print(r+",");
		}
		
System.out.println("\n------------------------------\n");
		
		System.out.println("Math.Random() 이용");
		for(int i=1; i<5; i++) {
		double rnd = Math.random();
		System.out.println(rnd);
			
		}
		
		
		
	}

}
