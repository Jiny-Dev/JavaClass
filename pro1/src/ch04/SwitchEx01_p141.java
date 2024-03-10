package ch04;

/*	제어문
	-조건문(if, switch)
	-반복문
	
* 	switch
	switch(변수명) {
	case 값1: 실행코드; break;  //break; 조건 1을 만족하면 끝내라
	case 값2: 실행코드; break;
	case 값n: 실행코드; break;
	default: 실행코드; break;    //default.는 원하는 값이 없을 때 실행,  break; 없어도 됨 
	}
*/

public class SwitchEx01_p141 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		//맨 상위에 import java.util.Scanner; 하는 것이 편하다
		
		//p143  int 타입 사용
		String result = null;
		
		
		
		
		//user로부터 정수 값을 받으세요
//		System.out.print("정수 값을 입력하세요:  ");
//		int num = scanner.nextInt();
		
		////1~6 사이의 난수 발생
//		int num = (int)Math.random();
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		 		case 1: result = "1번"; break;
		 		case 2: result = "2번"; break;
		 		case 3: result = "3번"; break;
		 		case 4: result = "4번"; break;
		 		case 5: result = "5번"; break;
		 		case 6: result = "6번"; break;
		 		default:  result = "그외"; break;
		}
		System.out.println(num+"번을 입력하였습니다");
		System.out.println(result+"을 입력하였습니다");

		System.out.println("-----------------");
		
	    //p143  char 타입 사용
		char grade = 'A';  //한 글자 char 타입이기 때문
		switch(grade) {
			case 'A': result = "A입니다"; break;
			case 'B': result = "B입니다"; break;
			case 'a': result = "a입니다"; break;
			case 'b': result = "b입니다"; break;
			default:  result = "그외"; break;
		}
		System.out.println(result);
		
		System.out.println("-----------------");
		
		//p144  String 타입 사용 해보자
		
	}

}
