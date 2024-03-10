package ch13_CollectionFramework;

//p173
/*
*동일성(identity): 객체의 주소
-두 참조변수가 동일한 주소를 가리킨다면(같은 객체)
 두 객체는 동일하다.
*동등성(equality): 객체의 모양
-두 객체의 내용이 같다면 
 두 객체는 동등하다

==: 주소 비교. 주소가 일치하면 true
기준문자열.equals(비교문자열): 값 자체(모양)를 비교
*/
public class StringEquals_p173 {

	public static void main(String[] args) {

		String str1 = "손흥민";
		String str2 = "손흥민";
		System.out.println("str1= " + str1); //str1= 손흥민
		System.out.println("str2= " + str2); //str2= 손흥민
		System.out.println("참조변수.toString()= "+str2.toString()); //@주소가 나오지 않음

		System.out.println("(str1 == str2)의 결과= "+(str1 == str2));
		if (str1 == str2) {
			System.out.println("str1==str2는 일치합니다."); // 출력
		} else {
			System.out.println("str1==str2는 불입치합니다.");
		}

		System.out.println("str1.equals(str2)의 결과= "+str1.equals(str2));
		if (str1.equals(str2)) {
			System.out.println("str1.equals(str2)는 일치합니다.");  // 출력
		} else {
			System.out.println("str1.equals(str2)는 불입치합니다.");
		}

System.out.println("==========");

		String str3 = new String("손흥민");
		String str4 = new String("손흥민"); 
		//Hip 영역 주소가 각각 생성된다.
		System.out.println("str3= " + str3); //str3= 손흥민
		System.out.println("str4= " + str4); //str4= 손흥민
		System.out.println("참조변수.toString()= "+str4.toString()); //@주소가 나오지 않음

		System.out.println("(str3 == str4)의 결과= "+(str3 == str4));
		if (str3 == str4) {
			System.out.println("str3==str4는 일치합니다.");
		} else {
			System.out.println("str3==str4는 불입치합니다."); // 출력
		} //new를 이용해서 각각 다른 객체로 저장되어 주소가 다르기 때문에 => 주소 값 비교

		System.out.println("str3.equals(str4)의 결과= "+str3.equals(str4));
		if (str3.equals(str4)) {
			System.out.println("str3.equals(str4)는 일치합니다.");  // 출력
		} else {
			System.out.println("str3.equals(str4)는 불입치합니다.");
		} //외형 비교 => 모양 비교 => 회원가입시 비밀번호와 비밀번호 확인 비교(주소지 비교 안함)

	
	}

}

