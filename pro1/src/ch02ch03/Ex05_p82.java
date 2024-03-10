package ch02ch03;

//+연산에서의 문자열 자동 타입 변환
public class Ex05_p82 {

	public static void main(String[] args) {
		
		int n1 = 100;
		System.out.println(n1);            //정수 값 출력 "백"
		
		String v1 = "100";		
		System.out.println(v1);            //문자열 변수 출력 "일공공"
		System.out.println("100");      //문자열 변수 출력 "일공공"
//문자와 숫자의 차이		
//ex) 주민등록번호 123456-1234567
//      숫자면123456-1234567 = -11111111, 문자면 "123456-1234567"		
		
		int n2 = 100;
		
		System.out.println(n2-1+"세");  
		
//		System.out.println("나이:"+n2-1+"세");    
		// 문자 뒤에 숫자 더하기와 빼기가 들어가 불가
		//문자와 숫자는 서로 연산이 되지 않는다
		//The operator - is undefined for the argument type(s) String, int
		
		System.out.println("나이:"+(n2-1)+"세"); 
		// 앞에 문자열이 들어가면서 전체가 문자열화
		//나이와 더하기 전 (n2-1)가 먼저 진행되어 100-1 = 99
		//"나이"+"99"+"세"    //자동으로 99가 문자화
		//나이99세
	
		String v2 = "100";		
		System.out.println(v2+"세");         //문자열 변수
		
//		System.out.println("나이:"+v2-1+"세");     
        //문자열에서 숫자를 뺄 수 없다(v2-1 불가능)
//		System.out.println("나이:"+(v2-1)+"세");
		//v2가 이미 문자열이기 때문에 괄호를 하여도 숫자와 문자의 연산이 이루어지지 않는다
		
		System.out.println("나이:"+"100"+"세");     
		
		
		System.out.println("------------------------------------------");
		
		String v3 = "100";
		//문자열 String을 정수(byte, short, int, long)로 변환했을 때
		byte v4 = Byte.parseByte(v3) ; // 문자열 "일공공"을 정수 "백"으로 변환
		
		
		System.out.println(v4+"<==Byte.parseByte()후.");
		System.out.println("나이:"+(v4-1)+"세");//문자열 변수
		System.out.println("나이:"+"100"+"세");
		
		System.out.println("------------------------------------------");
		
		String v5 = "100";
		short v6 = Short.parseShort(v5); // 문자열 "일공공"을 정수 "백"으로 변환
				
		System.out.println(v6+"<==파싱후.");
		System.out.println("나이:"+(v6-1)+"세");//문자열 변수
		System.out.println("나이:"+"100"+"세");
				
		System.out.println("------------------------------------------");
		
		String v7 = "100";
		
		long v8 = Long.parseLong(v7);			// 문자열 "일공공"을 정수 "백"으로 변환
				
		System.out.println(v8+"<==파싱후.");
		System.out.println("나이:"+(v8-1)+"세");//문자열 변수
		System.out.println("나이:"+"100"+"세");
				
		System.out.println("------------------------------------------");
		
		String v9 = "100";
		
		int v10 = Integer.parseInt(v9); // 문자열 "일공공"을 정수 "백"으로 변환
 		
		System.out.println(v10+"<==파싱후.");
		System.out.println("나이:"+(v10-1)+"세");//문자열 변수
		System.out.println("나이:"+"100"+"세");
				
		
		//앞글자가 대문자인것은 포장 클래스이다(char과 int는 조금 다르다)
		
	}

}
