package ch02ch03;

/*타입 변환
- 데이터 타입을 다른 타입으로 변환하는 것
- byte ↔ int,    int ↔ double

*종류
- 자동(묵시적) 타입 변환: Promotion
- 강제(명시적) 타입 변환: Casting
 */
public class Ex04_p76 {

	public static void main(String[] args) {
		
		
		//정수 연산 자동 타입 변환
		
		//정수: byte(1) < short(2) < int(4) < long(8) 
		//실수: float(4) < double(8)
		//종합: byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
		System.out.println("-----------------------");
		
		int a = 10;
		int b = 20;
		int result = a+b;
		System.out.println(result);
		long result1 = a+b;
		System.out.println(result1);
		double result2 = a+b;
		System.out.println(result2);
		
		System.out.println("-----------------------");
		
		byte n1 = 10;
		byte n2 = 20;
//		long r1 = n1+n2;         //가능
//		int r1 = n1+n2;            //가능
		
//		short r1 = n1+n2;       //에러
		//Type mismatch: cannot convert from int to short
		//기본인 int로 변환이 되고 난 뒤 연산이 이루어진다.
		//즉, int+int로 int 타입의 값인데 그보다 작은 byte와 short로 변환하려 하여 에러
		
		short r1 =(short) (n1+n2);   // short로 강제 형 변환 해야 한다
		
		System.out.println(r1); //30
		
		System.out.println("-----------------------");
	
		
		//나누기 연산자의 결과 몫 구하기
		
		byte v1 = 100;
		short v2 =20;
		
		int r11 = v1/v2;                //가능   5
//		short  r12 = v1/v2;          //에러
		long  r13 = v1/v2;          //가능    5
		float  r14 = v1/v2;         //가능    5.0
		double  r15 = v1/v2;     //가능    5.0
		
		System.out.println(r11);
//		System.out.println(r12);
		System.out.println(r13);
		System.out.println(r14);
		System.out.println(r15);
		
		//나누기 연산자의 결과 나머지 구하기
		
		byte v3 = 101;
		short v4 =20;
		
		int r16 = v3%v4;                //가능   1
//		short  r17 = v3%v4;           //에러
		long  r18 = v3%v4; ;         //가능    1
		float  r19 = v3%v4;          //가능    1.0
		double  r20 = v3%v4; ;     //가능    1.0
		
		System.out.println(r16);
//		System.out.println(r17);
		System.out.println(r18);
		System.out.println(r19);
		System.out.println(r20);
		
		System.out.println("-----------------------");
		
		int x =100;
		double y = 3.14;
		
/*	
//		int r20 = x + y;           
//		short r21 = x + y;
//		long r22 = x + y;
//		float r23 = x + y;
*/
		double r24 = x + y;
// double이 가장 크기 때문에 double을 제외한 나머지는 불가	
		
		
//		System.out.println(r20);
//		System.out.println(r21);
//		System.out.println(r22);
//		System.out.println(r23);
		System.out.println(r24);
		
		
		
	}


}



