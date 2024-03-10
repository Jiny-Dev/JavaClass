package ch11;

//p486
/*String 클래스의 여러 메소드
=>javascript의 String객체의 메서드,
 	유느의 문자열 타입의 함수와 유사하니 잘 익히자*/
public class StringEx02_p486 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍123!abc";
		System.out.println("str= " + str);
		System.out.println("str.toString()= " + str.toString());
		System.out.println("str.length()= " + str.length());

		System.out.println("================");

		// charAt():문자추출 -> String의 메서드
		char c1 = str.charAt(0);
		char c2 = str.charAt(14);
		System.out.println("str.charAt(0)= " + c1);
		System.out.println("str.charAt(14)= " + c2);
		System.out.println(str.charAt(str.length() - 1));

		System.out.println("================");

		String inputedID = "고양이";
		String dbID = "고양이";
		// "기준문자열".equals("비교문자열") => 내용일치, 대소문자 구분
		if (inputedID.equals(dbID)) {
			System.out.println("문자열 내용 일치");
		} else {
			System.out.println("문자열 내용 불일치");
		}

		// == => 주소비교(동일성)
		if (inputedID == dbID) {
			System.out.println("문자열 동일 주소");
		} else {
			System.out.println("문자열 비동일 주소");
		}

		System.out.println("================");

		// indexOf():문자열찾기-p491
		//주어진 문자열의 시작하는 인덱스를 반환. 인텍스는 0부터 시작
		// ★만약 주어진 문자열이 포함되어 있지 않으면 -1리턴
		System.out.println("str.indexOf('프')= " + str.indexOf('프')); //3
		int idx = str.indexOf('프');
		System.out.println("str.indexOf('프로그래밍')= " + str.indexOf("프로그래밍")); //3
		
		//DBMS에서는 책 이름에 프로그래밍이라는 단어가 포함되어 있는 것을 검색
		//select(DB) *from 책table where 책이름 like '%프로그래밍%'; //DB에서는 문자열 ' '로 표현
		if(idx>-1) { //0, 1, 2 ...
			System.out.println("해당 도서가 존재합니다.");
		}else {
			System.out.println("해당 도서가 존재하지 않습니다.");
		}

		String str2 = "";
		//String str2 = null;
		int length = str2.length();
		System.out.println("str2.length()= "+length);
		
		//응옹편: 필수 입력 체크(id, 비번, 이름, 이메일 등)
		if(str2=="" || length<=0) {
			System.out.println("필수 입력사항입니다. 입력하세요.");
		}

		//응옹편: 필수 입력 체크(id, 비번 글자 길이 체크)
		//여기에서는 글자의 길이가 11이상~15이하일 경우 유효하다
		//글자 길이가 11보다 짧거나 15보다 길면 무효하다
		if(length<11 || length>15) {
			System.out.println("글자 길이가 11이상 15이하로 작성해야 합니다.");
		}
		
		System.out.println("================");
		
		//문자열 찾아 바꾸기: replace(찾는 문자열, 바꿀 문자열)-p493
		String oldTitle = "java programming";
		String newTitle = oldTitle.replace("programming", "프로그래밍");
		System.out.println(newTitle);
		
		//대문자 변경(p495)
		//★★★주의! 대소문자로 바꾼 새로운 문자열을 생성한 후 리턴!
		//문자열.toLowerCase(): 소문자로 변경
		//문자열.toUpperCase(): 대문자로 변경
		System.out.println(newTitle.toUpperCase());
		
		System.out.println("================");

		//trim(): 문자열 앞뒤 공백 제거(p497)
		//주의! 앞뒤 공백 제거 후 새로운 문자열을 생성한 후 리턴!
		//주의! 중간에 포함된 공백은 제거 x
		String s = "  가나다  ";
		System.out.println("공백 제거 전 글자= "+s);
		System.out.println("공백 제거 전 글자 수= "+s.length());
		System.out.println("공백 제거 후 글자= "+s.trim());
		System.out.println("공백 제거 전 글자 수= "+s.trim().length());
		
		System.out.println("================");
		
		//★★★★★대상문자열.substring(): 문자열 추출
		//대상문자열.substring(시작인덱스): 시작인덱스 포함해서 끝까지
		//대상문자열.substring(시작인덱스, 끝인덱스): 시작인덱스 포함해서 끝인덱스 바로 앞까지, 끝인덱스 미포함
		String ssn = "123456-1234567";
		System.out.println("원본= "+ssn);
		System.out.println("원본.length()= "+ssn.length());
		System.out.println("ssn.substring(7)= "+ssn.substring(7));//뒷자리
		System.out.println("ssn.substring(7, 8)= "+ssn.substring(7, 8));//성별
		System.out.println("ssn.substring(2, 6)= "+ssn.substring(2, 6));//출생월일
		
		String cafe = "고구마라떼";
		System.out.println(cafe.substring(3));
		System.out.println(cafe.substring(0, 3));
	}

}
