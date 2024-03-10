package ch02ch03;

//	char타입(p63)

/*기본타입(primitive type)
 *정수타입: byte(1) < short(2) < char(2) < int(4) < long(8)
 *실수타입: float(4) < double(8) 
 *논리타입: boolean(true, false)
 */
public class Ex02_p60 {

	public static void main(String[] args) {
//		char타입은 유니코드로 변환되어 저장
/*
* 유니코드?
* 국제표준규약
* 세계 각국의 문자를 2byte로 표현
 * 숫자(0~65535)로 매핑
*/
		
		char v1 = 'A';
		int v11 = v1;
		char v2 = 'a';
		int v21 = v2;
		int v22 = 'b';
//		char v3 = v22; //Type mismatch: cannot convert from int to char
		char v3 = (char)v22; //강제 타입 변환 필요
		
		
		System.out.println("char v1=" + v1); //A
		System.out.println("int v11=" + v11); //65
		System.out.println("char v2=" + v2); //a
		System.out.println("int v21=" + v21); //97
		System.out.println("int v22=" + v22); //98
		System.out.println("char로 확인 v22=" + v3); //b
		
		String x = "A"; 
		//char과의 차이
		// String은 대문자로 시작하는 클래스로 기능을 더 사용할 수 있다. 주소가 저장됨
//		String x = new String ("A"); //원칙은 다음과 같으나 자주 사용되기 때문에 위와 같다 
		
		System.out.println(x);
		System.out.println(x.toLowerCase()); 
		//String 클래스에서 제공한 toLowerCase() : 소문자로 변경
		System.out.println("A".toLowerCase()); 
		//""로 인해 문자열, 클래스의 기능 사용 가능
		System.out.println("a".toUpperCase()); 
		//String 클래스에서 제공한 toUpperCase() : 대문자로 변경
		
		System.out.println();
		
		//v1에 저장된 'A'를 'a'로 변환하시오
		
		//대소문자의 차이가 32로 규칙적인 패턴을 가진 것을 파악
		System.out.println(v1+32); //97 숫자로 나옴
		System.out.println((char)(v1+32)); //char로 강제 변환 //a
		//or
		char result = (char)(v1+32);
		System.out.println(result);
		
		
	}

}
