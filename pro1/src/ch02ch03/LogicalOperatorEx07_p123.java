package ch02ch03;


/*논리 연산자(p121) - && ||
-피연산자가 반드시 boolean이어야 하며 연산 결과도 boolean이다.
-&&가 ||보다 우선순위가 높다. 같이 사용할 경우 괄호를 사용하자.
-> or연산자(||): 피연산자 중 하나라도 true이면 true이다.
->and연산자(&&): 피연산자 양쪽 모두 true이면 true이다.
*/
public class LogicalOperatorEx07_p123 {

	public static void main(String[] args) {
		
		int charCode = '1'; // 65이상 90이하이면 대문자
		System.out.println("int charCode=" + charCode);
		System.out.println("(char)charCode=" + (char)charCode);
		
		if(charCode>=65 && charCode<=90){ //비교연산자(1)와 논리 연산자(20가 사용되었다.
			System.out.println("대문자구나!");
		}else if(charCode >=97 && charCode <=122){
			System.out.println("소문자구나!");
		}else {
			System.out.println("영문자가 아니구나!");
		}
	
		System.out.println("__________________________");
		
		int v = 3;
		
		//&&: 첫번째 조건이 false이면 두번째 조건을 확인하지 않음
		//단축 평가로 인해 그만큼 연산이 빠르다
		if(v%2==0 && v%3==0 ) { 
			System.out.println(v+"2와 3의 공배수");	//하나만 true여서 미출력
		}
		//&: 첫번째 조건이 false여도 두번째 조건을 확인
		if(v%2==0 & v%3==0 ) { 
			System.out.println(v+"은(는) 2와 3의 공배수");	//하나만 true여서 미출력
		}
		if(v%2==0) { //2 4 6 8 10 ....
			System.out.println(v+"은(는) 2의 배수");	//false이기 때문에 미출력
		}
		if(v%3==0) { //3 6 9 12 ....
			System.out.println(v+"은(는) 3의 배수");
		}
	
		System.out.println("__________________________");
		
		if(v%2==0 || v%3==0 ) { 
			System.out.println(v+"2의 배수 || 3의 배수");	//하나가 true여서 출력
		}
		//&: 첫번째 조건이 false여도 두번째 조건을 확인
		if(v%2==0 | v%3==0 ) { 
			System.out.println(v+"2의 배수 | 3의 배수");	//하나가 true여서 출력
		}

	}
}	

