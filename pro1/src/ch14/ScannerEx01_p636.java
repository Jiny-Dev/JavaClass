package ch14;

//java에서는 java.lang패키지는 import하지 않아도 된다
//java.util 패키지 안의 Scanner 클래스를 import
import java.util.Scanner;

/*Scanner 클래스(p636)
-java.util 패키지에서 제공하는 클래스
-사용자로 부터 입력 받기 위해 사용되는 클래스
 */
public class ScannerEx01_p636 {

	public static void main(String[] args) {
		//타입             변수명;   //참조변수 선언
		//클래스명     변수명; 
		//-String name;
		
		//class(클래스)로부터 object(객체) 생성
		//new 클래스명();   //object(객체) 생성 코드
		//-String name2 = new String("홍길동");   //정석
		//-String name1 = "홍길동";   //자주 사용되기 때문에 예외적으로 이와 같이 사용
		
		
		//Scanner class(클래스)로부터 object(객체) 생성하여 참조
		Scanner sc = new Scanner(System.in);    //Scanner()의 생성자, 클래스와 변수명이 같을 때(변수명은 소문자
		
		//.nextLine(); 한 줄의 문자열을 입력 받는 메소드
		System.out.print("이름을 입력하세요:   ");
		String name = sc.nextLine();   //.nextLine() 콘솔 창에 입력 값을 읽음 
		System.out.println("입력 받은 이름:   "+name);  // 읽은 것을 출력
		
		System.out.println("------------------------------");
		
		//.nextInt(); 한 줄의 정수 값을 입력 받는 메소드
		System.out.print("나이을 입력하세요:   ");
		int age = sc.nextInt();   //형 변환에 신경쓰자 .nextInt(), .nextByte(), .nextLong()....
		System.out.println("입력 받은 나이:   "+age);  // 읽은 것을 출력
		
		System.out.println("------------------------------");
	
		//.nextDouble(); 한 줄의 실수 값을 입력 받는 메소드
		System.out.print("신장을 입력하세요(소수점 포함):   ");
		double height = sc.nextDouble();  
		System.out.println("입력 받은 신장:   "+height);  // 읽은 것을 출력
		
		System.out.println("------------------------------");
		
		System.out.print("여성입니까?(true|false):   ");
		boolean isWoman = sc.nextBoolean();  
		System.out.println("입력 받은 답변:   "+isWoman);  // 읽은 것을 출력
		
		sc.close();   //자원해제: 없어도 좋으나 문제 발생 가능  
		
	}

}
