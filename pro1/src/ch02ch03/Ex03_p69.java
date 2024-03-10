package ch02ch03;


//논리형 - false, true
public class Ex03_p69 {

	public static void main(String[] args) {
		//데이터타입 변수명 = 초기값;
		boolean stop = false; 
		// true나 false만 들어가고 1을 넣었을 때는 읽지 않는다
		//강제 형 변환 되지 않는다
		System.out.println("stop="+stop); //true
		
		if(stop==true) {
			System.out.println("stop상태입니다.");
		}
		
		if(stop==false) {
			System.out.println("nonstop상태입니다.");
		}
		
		System.out.println("-------------------------");
		
		if(stop!=true) {
			System.out.println("stop 변수값이 true가 아니다.");			
		}
		
		else {
			System.out.println("stop 변수값이 false.");
		}
		
		System.out.println("-------------------------");
		
		//코드를 줄여보자
		if(!false) { //false의 반대라면 => false가 아니라면
			System.out.println("조건충족");			
		}
		
		else {
			System.out.println("조건충족x");
		}
		
		System.out.println("-------------------------");
	
		if(!stop) { //!true => false => if(false) 그러므로 else가 실행됨
			System.out.println("조건충족");			
		}
				
		else {
			System.out.println("조건충족x");
							
		}
		
		
		
		if(stop) { //false이기 때문에 할게 없어서 else를 통한 false결과 만들기 
			System.out.println("true 입니다");			
		}
		
		else {
			System.out.println("false 입니다");
			
		}
		
	}

}
// = 오른쪽을 왼쪽에 종속
// == 오른쪽 왼쪽이 같다
//boolean 안에는 두개 true, false만 들어온다
//== 옆에는 변수와 리터럴 값 모두가 들어갈 수 있다
//!는 뒤에 온 것을 부정 !false = true, !true = false
//stop!=true    => stop 변수값이 true가 아니다