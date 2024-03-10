package ch02ch03;

public class Ex02 {

	public static void main(String[] args) {
		//데이터타입 변수명;  //변수 선언
		String name;
		//변수명 = 값;              //값 할당
		name = "홍길동";  //초기값(default value)	
		
		System.out.println("개명 전 회원명:"+name); //콘솔 출력
		// + 연결 연산자
		
		//임의비밀번호를 pwd에 저장 및 출력
		String pwd = "123456789";
		System.out.println("비번:"+pwd+"\n");
		
		String id = "hongid";
		System.out.println("id:"+id); //콘솔 출력

		name = "홍GD";
		System.out.println("개명 후 회원명:"+name);
	}

}
