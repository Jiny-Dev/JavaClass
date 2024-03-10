package ch05_Array;

import java.util.ArrayList;
import java.util.List;

/*변수의 타입
*기본타입(primitive type): 리터럴 값 저장
  정수(byte(1)<short(2)<int(4)<long(8)), 실수(float(4)<double(8)) 
 
 *참조타입(reference type): 정수
  배열, 열거, 클래스, 인터페이스
*/

//타입별 초기 값이 자동으로 들어간다(자동 초기화 된다)
public class ArrayEx03 {

	public static void main(String[] args) {     //(String[] args);
		//int타입 5개의 값이 저장될 수 있는 arr1 배열선언
		int[] arr0 = null; 
		// 기본 값이 null(주소가 들어 가야함을 뜻하며 아직 값이 없음)
		//int[] arr0 => stack
		System.out.println(arr0); 
		arr0 = new int[5];
		//new int[5] => heap
		System.out.println(arr0); 
		
		for(int i=0;i<arr0.length;i++) {
			System.out.println(arr0[i]); //값을 넣지 않아도 기본 값 0이 출력 된다(정수 0)
		}
		
		System.out.println("\n-----------------");
		
		double[] arr1 = new double[5];
		System.out.println(arr1); //값 [I@6a5fc7f7 16진수 코드 //@는 ~에(주소)
		
		for(double temp : arr1) {
			System.out.println(temp);//값을 넣지 않아도 기본 값 0.1이 출력 된다(실수 0.0)
		}

		System.out.println("\n-----------------");
		//boolean 타입
		boolean arr2[]  = new boolean[5];
		for(boolean temp : arr2) {
			System.out.println(temp);//값을 넣지 않아도 기본 값 false가 출력 된다(논리 false)
		
		}
		
		System.out.println("\n-----------------");
		//char 타입
		char arr3[]  = new char[5];
		for(char temp : arr3) {
			System.out.println(temp);//값을 넣지 않아도 기본 값 공백이 출력 된다(char 공백)
		}
		
		System.out.println("\n-----------------");
		//String 클래스 타입 arr4 배열 변수 선언 및 생성 후 값 출력
		String arr4[] = new String[4];
		
		for(String temp : arr4) {
			System.out.println(temp);
			}
				
		System.out.println("\n-----------------");
		//List인터페이스 arr5 배열 변수 선언 및 생성 후 값 출력
		//타입 변수명 = new 타입[5];
		List[] arr5 = new ArrayList[5]; 
		//인터페이스는 생성자가 없어 객체를 만들 수 없어 뒤에 타입 대신 class
		System.out.println(arr5);
		for(List temp : arr5) {
			System.out.println(temp);// null 주소가 들어가기 전 상태
			}
	}

}
