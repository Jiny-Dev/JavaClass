package ch13_CollectionFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//p577
//user로 부터 id와 비번을 입력받아
//(원래는 db의 회원 table에 접속하여 특정회원 id와 해당 비번을 비교)
//여기서는 Hashtable에 저장된 특정회원 id와 해당 비번을 비교
public class HashtableEx02_p577 {

	public static void main(String[] args) {

		// 데이터 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 로그인 화면 ====");
		System.out.print("아이디: ");
		String inputedId = sc.nextLine();
		System.out.print("비밀번호: ");
		String inputedPwd = sc.nextLine();
		System.out.println();

		// Hashtable에 회원 id와 비밀번호
		Map<String, String> map = new Hashtable<String, String>();
		map.put("강아지", "123");
		map.put("고양이", "456");
		map.put("너구리", "789");
		map.put("고라니", "147");
		map.put("오소리", "258");

		// 비즈니스 로직 수행
		// 입력받은 내용가 저장된 내용이 일치하면 "로그인 성공"
		// 그렇지 않으면 "로그인 실패"
		String result = null;

		if (map.containsKey(inputedId)) { // containsKey() 안에 해당 내용이 있는지 확인
			String memberPwd = map.get(inputedId);
			if (memberPwd.equals(inputedPwd)) {
				result = "로그인 성공";
			} else {
				result = "비밀번호가 틀렸습니다.";
			}
		} else {
			result = "Id가 존재하지 않습니다.";
		}

		// 결과 출력
		System.out.println(result);
		
	}

}
