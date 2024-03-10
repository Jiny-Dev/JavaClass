package ch11;

import java.text.SimpleDateFormat;
//java.lang패키지(클래스, 인터페이스, Ex)를 제외한 패키지는 import 해야 한다.

//java.lang 패키지 (클래스, 인터페이스, Exception 등) 외의 패키지
import java.util.Date; // 유틸 안의 Data만 가져온다
//import java.util.*; //유틸 안의 모든 것을 가져온다.(유틸 패키지 안의 하위 유틸폴더들은 가져오지 않는다.

import ch02ch03.Ex01;//자바 사용자(내가) 정의한 것

//Date 클래스: 날짜를 표현하는 클래스
public class DateEx01_p514 {
	public static void main(String[] args) {
//		타입 변수 = 초기값;
//		heap타입 참조변수 = heap 주소;
//		클래스명 참조변수 = new 클래스명();
		//Date now: Date 클래스 타입의 참조변수 now 선언
		//new Date(): Date 클래스의 객체(object)를 생성
	
		Date now = new Date();
		//Date 클래스의 객체(object)를 생성하여
		//Date 클래스 타입의 참조변수 now에 주소를 저장
		System.out.println(now);//Wed Jan 31 17:30:37 KST 2024
		String strNow = now.toString();
		System.out.println(strNow);//Wed Jan 31 17:42:14 KST 2024
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}                    

}
/*		Date now = new Date();
		//Date 클래스의 객체(object)를 생성하여
		//Date 클래스 타입의 참조변수 now에 주소를 저장
		System.out.println("now= "+now);//now= Wed Jan 31 17:30:37 KST 2024
		
		String name = new String("세종대왕");
		System.out.println("name= "+name);//name= 세종대왕
		
		Ex01 myObj = new Ex01();
		System.out.println(myObj);//ch02ch03.Ex01@3c09711b
													   //패키지명 + 클래스명 + 16진수 코드
													   //위 다른 클래스와 값 출력 방법이 다른 것을 볼  수 있다.
 */
