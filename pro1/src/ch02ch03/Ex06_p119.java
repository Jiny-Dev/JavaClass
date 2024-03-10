package ch02ch03;

/*
 * 단항연산자: 피연산자 수 1개 - !
 * 이항연산자: 피연산자 수 2개 - 비교연산자, 산술연산자(대부분의 연산자는 이항이다)
 * 삼항연산자 피연산자 수 3개 - 조건? 참일 경우 : 거짓일 경우;(조건, 참, 거짓 총 3개다) 
 * 비교연산자(p199)
 A==B A는 B와 같다, 동일, 일치
 A!=B A는 B와 같지 않다, 동일X, 일치 X
 
 A>B      A는 B 보다 크다. 초과
 A<B      A는 B 보다 작다. 미만
 A>=B   A는 B 보다 크거나 같다. 이상
 A<=B   A는 B 보다 작거나 같다. 이하
 
 if(조건){
 조건이 true => 조건 충족 시 실행코드
 }
 
 
 
 if(조건){
 조건이 true => 조건 충족 시 실행코드
 }
else{
조건이 true => 조건 충족x 시 실행코드
}




// 합격자 불합격자 외의 예비합격자 같은 조건을 만들 수 있다
if(조건1){
	조건1이 true => 조건1 충족 시 실행코드
}
else if(조건2){
	조건2 충족 시 실행코드
}
else if(조건n){
	조건n 충족 시 실행코드
}
else{
	모든 조건 충족x 시 실행코드
}
//조건은 그 수가 많아질 수 있다

 */

public class Ex06_p119 {

	public static void main(String[] args) {

		int score = 80;
		
		if(score==80) {
			System.out.println("합격");
		}
		
		
		if(score!=80) {
			System.out.println("합격");
		}
			else {
				System.out.println("불합격");
			}
		
		
		if(score>80) {
			System.out.println("합격");
		}
			else {
				System.out.println("불합격");
			}
			
		
		if(score>=80) {
			System.out.println("합격");
		}
			else {
				System.out.println("불합격");
			}
		
		
		//대기 합격자 만들기
		if(score>=80) {
			System.out.println("합격");
		}
			else if(score>=70) {
				System.out.println("대기 합격");
			}
			else {
				System.out.println("불합격");
			}
		
		System.out.println("-----------------------------------");
		
		//삼항연산자로 표기해보자
		//조건? 참일 경우 : 거짓일 경우;
		
		String result = "";
		
		result = score>=80? "합격":"불합격";
		System.out.println(result);
		
		if(score>=80) {
			 result = "합격";
		}
			else {
				result = "불합격";
		}
		

		
	}

}
