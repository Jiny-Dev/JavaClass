package ch06ch07;
//이 클래스는 Book01 클래스의 실행 클래스이다.
public class Book01_Main {

	public static void main(String[] args) {
		//Book01 클래스 타입 참조변수 선언
		Book01 myBook;
		//Book01클래스의 객체를 생성
		myBook = new Book01(); //하나만 있으면 된다.
		
		//속성 확인 필드의 값 출력
		System.out.println("책 제목= "+myBook.title);
		System.out.println("저자명= "+myBook.writer);
		System.out.println("출판사= "+myBook.publisher);
		System.out.println("출판일= "+myBook.pubDate);
		System.out.println("가격= "+myBook.price);
		
		//숨겨진 마진율
		//System.out.println("마진율= "+myBook.); 보이지 않는다.
		
		//System.out.println("마진율= "+myBook.margin);//The field Book01.margin is not visible
		//직접 입력하여도 보이지 않는다는 결과가 생성된다.
		
		//------------------------------------------------
		
		//생성자
		//constructor
		Book01 myBook1 = new Book01(); //얘도 메소드가 된다.
		//타입과 클래스는 같으나 추후 학습 과정에서 다른 경우를 학습한다.
		System.out.println(myBook1);
		System.out.println("책 제목= "+myBook1.title);
		
		//------------------------------------------------
		
		//메소드 호출
		
		//1)매개변수 없고, 리턴값 없는 메소드
		myBook.braille(); //점자 기능
		
		//2)매개변수 없고, 리턴값 있는 메소드
		String returnValue = myBook.soundBook();// 책읽기
		//String returnValue = "soundBook()-책을 읽어줍니다"; 위를 해석하면
		System.out.println(returnValue);
		
		//3)매개변수 있고, 리턴값 없는 메소드
		myBook.codeRun("프로젝트 소스");//코드 실행 기능
		
		//4)매개변수 있고, 리턴값 있는 메소드
		int returnedValue = myBook.timer(3);
		System.out.println("decibel="+returnedValue);
	}
// 위 세가지를 구성멤버 라고 한다
}
