package ch06ch07;

import java.text.SimpleDateFormat;
import java.util.Date;
// 클래스는 역할에 따라서 분리 개발하여야 한다.
//field - 속성.data(주로 명사형)
//method - 기능.동작
//constructor - 객체 생성 & field 초기화(주용도로 사용)
//경우에 따라서 field만 존재하거나 field & method 모두 존재하지 않을 수 있다.

public class Book01 {
	//field
	//[ 접근제한자][제한자 ]타입 필드명[ =초기값]; [ ]는 잇으나 생략되어 있는 것
	String title = "JAVA잡자";                  //제목
    String writer = "세종대왕";               //저자
	String publisher = "좋은 출판사";    //출판사명
    Date pubDate = new Date();             //출판일
	int price = 35000;                              //판매가
	//main에서 지역변수로 사용하던 것을 전역변수의 형태로 field를 생성하였다.
	
	//접근제한자- 아무도 접근할 수 없는 제한자(숨김)
	//[접근제한자][제한자]double margin = 0.3;//마진을 숨겨보자
	
	//마진을 숨겨보자
	private double margin = 0.3;   //마진율 앞에 [접근제한자]로 제한
	
    //constructor
	Book01(){
		System.out.println("Book01의 constructor 진입");
	}
	
	//method - 기능.동작
	
	//1)매개변수 없고, 리턴값 없는 메소드
	void braille() { //점자 기능 메소드를 만드려고 한다.
		System.out.println("braille()method야~");
	}	
	
	//2)매개변수 없고, 리턴값 있는 메소드
	String soundBook() {
	return "soundBook()-책을 읽어줍니다";
	}
		
	//3)매개변수 있고, 리턴값 없는 메소드
	void codeRun(String code) {//code에 "프로젝트 소스"가 들어옴
		System.out.println(code+"받아서 실행-codeRun()");
	}
	
	//4)매개변수 있고, 리턴값 있는 메소드
	int timer(int decibel) {
		int result = decibel*10;
		return result+9;    //return 리터럴, 변수명, 연산식 등이 들어와도 가능하다
									   //그래서 리턴 값은 표현식이라고 한다.


	
	}
	
	
	
}