package ch06ch07;

public class Computer01_Main {

	public static void main(String[] args) {
		//객체생성
		Computer01_p253 com1 = new Computer01_p253();
		
		
		//메소드 호출
		//int[] array = new {1, 2, 3}; //new 생략한 것과 같
		int[] array = {1, 2, 3};
		int result = com1.sum1(array);
		System.out.println(result);
		
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		result = com1.sum1(array1);
		System.out.println(result);

		//------------------------------------------------

		result = com1.sum2(array);
		System.out.println(result);

		result = com1.sum2(array1);
		System.out.println(result);

		//------------------------------------------------

		//int result = com1.sum1(); //값이 없으면 오류
		//System.out.println(result);
		
		result = com1.sum2(); //값이 없어도 실행 //단, 배열값의 입력을 요구시 문제
		System.out.println(result);
		}

}
