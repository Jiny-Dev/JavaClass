package ch02ch03;

/*타입 변환
- 데이터 타입을 다른 타입으로 변환하는 것
- byte ↔ int,    int ↔ double

*종류
- 자동(묵시적) 타입 변환: Promotion
- 강제(명시적) 타입 변환: Casting
 */
public class Ex04_p73 {

	public static void main(String[] args) {
		
		
		//자동 타입 변환
		
		//정수: byte(1) < short(2) < int(4) < long(8) 
		//실수: float(4) < double(8)
		//종합: byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
		byte v1 = 100;
		int v2 = v1;
		long v3 = v2;
		
		float v11 = 3.14f; //실수는 double이 기본이므로 리터럴 형 변환을 통해 float임을 알려줌
		double v12 = v11;
		
		// 작은 범위에서 큰 범위로 변환할 때에는 자동으로 변환이 된다
		
		
		float v21 = v2; // int -> float, 똑같은 4byte여도 정수보다 실수가 크기 때문에 올 수 있음
		double v22 = v2; //int -> double
		
//		long v23 = v11; //float -> long
		//Type mismatch: cannot convert from float to long
		//long은 소수점을 가질 수 없기 때문에 불가
		
		
		
		
		
		
		
		//강제 타입 변환(p74)
		
		//정수: byte(1) < short(2) < int(4) < long(8) 
		//실수: float(4) < double(8)
		//종합: byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
/*		int n1 = 123456;
		short n2 = n1;
		//Type mismatch: cannot convert from int to short
		//작은 범위에서 큰 범위로 변경 불가, 강제 형 변환 필요		
*/	
		
		int n1 = 123456;
		short n2 = (short)n1;
		System.out.println("int n1="+n1); //int n1=123456
		System.out.println("short n2="+n2); //short n2=-7616
		

/*		
		double n3 = 3.14;
		float n4 = n3;
		int n5 = n3;
		//작은 범위에서 큰 범위로 변경 불가, 강제 형 변환 필요
*/		
		
		double n3 = 3.14;
		float n4 = (float) n3;
		int n5 = (int)n3;
		System.out.println("double n3="+n3); //double n3=3.14
		System.out.println("float n4="+n4); //float n4=3.14
		System.out.println("int n5="+n5); //int n5=3(실수 -> 정수 정수인 3만 남음)
		//***값의 손실 주의: 오버플로우
		
		
	}


}
