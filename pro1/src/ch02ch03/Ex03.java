package ch02ch03;

/* 데이터 타입(p59)
 * 데이터 타입 변수명;
-기본 타입(primitive) : 값, 참조타입(reference) : 주소
 정수(소수점x): byte(1) < short(2) < int(4. 정수의 기본 타입) < long(8)
 실수(소수점o): float(4) < double(8. 실수의 기본 타입)                                => float는 int보다 크기가 크다(소수점이 있기 때문에)
 논리형: true, false
   */


public class Ex03 {

	public static void main(String[] args) {
		//데이터 타입 변수 = 초기값;
		byte v1 = -128;
		byte v2 = -127;
		byte v3 = 0;
		byte v4 = 100;
//		byte v5 = 128; //byte의 크기 초과
		short v6 = 128;
		int v7 = 128;
		long v8 = 128;
		
		
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
//		System.out.println("v5="+v5);
		System.out.println("v6="+v6);
		System.out.println("v7="+v7);
		System.out.println("v8="+v8);
		
		System.out.println("------------------------------");
		//20240125 강의

		//리터럴 형 변환: F, f, L, l
		
		int n4 = 123456789;
		long n5 = 123456789;
//		int n6 = 1234567891212;
		//The literal 1234567891212 of type int is out of range 
		//int 범위를 초과하여 불가

		
/*		long n7 = 12345678912;
		long n8 = 12345678912;
*/
	
		long n7 = 12345678912L;
		long n8 = 12345678912l;
		//정수의 기본값인 int 범위를 초과하여 불가
		//뒤에 L 또는 l를 붙여 강제 변환을 통해 long으로 인식시킴
		
		
		
/*     double n1 = 3.14;
		float n2 = 3.14;
		//Type mismatch: cannot convert from double to float
*/

		double n1 = 3.14;
		float n2 = 3.14F; 
		float n3 = 3.14f;
		// 실수의 기본인 double 값에서 작은 float 값으로 변환불가
		//뒤에 F 또는 f를 붙여 강제 변환을 통해 double로 인식시킴
		
	}

}
