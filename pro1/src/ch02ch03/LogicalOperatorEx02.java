package ch02ch03;

//논리연산자(p121) - && ||
/*피연산자가 반드시 boolean이어야 하며 연산결과도 boolean이다.
&&가 || 보다 우선순위가 높다. 같이 사용되는 경우 괄호를 사용하자
▶ OR연산자(||) : 피연산자 중 어느 한 쪽이 true이면 true이다.
▶ AND연산자(&&) : 피연산자 양 쪽 모두 true이면 true이다. 
t&&t&&f&&t는 첫번째 조건이 false면 두번째 조건을 확인하지 않는다.
f&t는 양쪽 조건을 살펴본다.
t||f는 첫번째 조건이 true이면 두번째 조건을 확인하지 않는다.
*/

public class LogicalOperatorEx02 {

	public static void main(String[] args) {

		int n1 = 10;
/*		int result = n1 / 2;                                            // n1/0, 0으로 나눌 수 없다. error
		System.out.println("resultr= " + result);
*/
		//method호출 : 메소드명( )

		boolean r1= (byZero() > 0) && (100 < 0); //둘 다 참이다
		// 아래 정의한 byZero() 를 가져온다.
		System.out.println(r1);
		boolean r2= (byZero() > 0) & (100 > 0); //둘 다 참이다
		System.out.println(r2);
		
		System.out.println("________________________");
		
		boolean s1= (100 > 0) || (byZero() > 0) ; //dead code: 앞에서 true를 확인했기 때문에 불필요
		System.out.println(s1);
		boolean s2= (100 > 0) | (byZero() > 0) ; //아래에 작성한 것이 다시 돌아와 호출된다
		System.out.println(s2);                              //메소드를 Ctrl클릭하면 호출코드를 볼 수 있다
		
/*
 * &&와 ||는 빠르긴 하지만 실행을 하지 못해 버리는 오류가 생길 수 있다 
 * boolean s1= (100 > 0) || (byZero()> 0) ; //위의 코드로 앞이 true가 되면서  byZero()를 호출하지 못한다.
 */
	}
	
//	method정의: 0으로 나누기
		public static int byZero() { // 위에서 호출한 장소로 간다. 
//		public static int byZero(매개변수(argument 또는 parameter):변수를 이곳에 선언하면 제일 먼저 빠르게 실행된다.) { 
//		public static int byZero(int arg) {  //위의 byZero(2)과 같이 값을 넣으면 아래에서 실행되어 위로 호출한다
			int result = 20/10;
//			int result = 20/ arg;
			return result;
	}
}
