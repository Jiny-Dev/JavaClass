package ch11;

import java.util.Arrays;

//String 클래스
public class StringEx01_p484 {

	public static void main(String[] args) {
		String str1 = "문자열";
		String str11 = "문자열";
		// str1과 str11은 동일 주소를 가진다.

		String str2 = new String("문자열");
		// new 키워드를 이용하여 객체 생성할 때마다 heap영역의 새 주소

		char c1 = 'A';
		int i1 = c1; //char 타입의 값은 내부적으로 정수로 저장된다.
		System.out.println("c1= " + c1);
		System.out.println("i1= " + i1);
		
		//char[]로 문자열 생성하기
		char[] charArr = { '대', '한', '민', '국' };
		String str3 = new String(charArr);
		System.out.println("char[]로 생성한 문자열 str3= " + str3);

		//byte[]로 문자열 생성하기
		byte[] byteArr = {106, 97, 118, 97};
		String str4 = new String(byteArr);
		System.out.println("byte[]로 생성한 문자열 str4= " + str4);

		//문자열을 byte[]로 변환하기(p489)
		//종종 문자열을 바이트 배열로 변환하는 경우가 있다.
		//대표 예로, 네트워크로 문자열을 전송하거나,
		//문자열을 암호화할 때 문자열을 바이트 배열로 변환하는 경우가 있다.
		//getBytes()
		byte[] bytes1= str4.getBytes();
		System.out.println("byte[] bytes1= "+bytes1);
		System.out.println("byte[] bytes1= "+bytes1.length);
		System.out.println(Arrays.toString(bytes1));
		String str5 = new String(bytes1);
		System.out.println("String str5= "+str5);
	}

}
