package ch04;

//반복문(for, while, do~while)
//for문 반복 횟수가 예측 가능한 경우
//while문 반복 횟수가 예측 불가능 한 경우
/*
for(타입 변수명 = 초기값; 조건; 증감식) {                 //반복문을 종료하는 조건이 없을 경우 무한루프
 	반복 실행 코드
} 
*/

//증감연산자 ++: 1씩 증가, --: 1씩 감소

public class ForEx01_p148 {

	public static void main(String[] args) {

		for(int cnt=1; cnt<=10; cnt++) {                    		//(1부터 시작; 카운트가 10이하까지, 카운트가 1씩 증가한다.)           
//			System.out.println("Hello");
			System.out.println(cnt + "번"+": Hello");      	//cnt를 넣어 카운트 수를 보이게 할 수 있다.
		} 

		System.out.println("-------------------------------------------------------"); // 줄바꿈
		
		//1 2 3 4 5
		for(int i=1; i<6; i++) {                     	       //i = index의 약자
			System.out.println(i);      	                   //for 블록 안에서 i가 선언된 지역변수이기 땨문에 다음 for문에서도 사용
		} 
		
		System.out.println("-------------------------------------------------------"); // 줄바꿈

		//1 2 3 4 5
		for(int i=5; i>0; i--) {
			System.out.println(i);      	
		} 
		
		System.out.println("-------------------------------------------------------"); // 줄바꿈
		
		//1+2+3+4+5의 합을 구하시오
		//0+1 = 1, 1+2 = 3, 3+3 = 6; 6+4 = 10. 10+5 = 15
	    int sum = 0;
		
		for(int i=1; i<6; i++) {
			sum = sum + i;                                                //sum = sum +i 1씩 증가한 것이 sum에 저장
			System.out.println(i + "일때 sum= " + sum + "입니다.");      	
		} 
		
		System.out.println("총합= "+ sum + "입니다.");  //sum을 삽입시 마지막 값 출력      	

		System.out.println("-------------------------------------------------------"); // 줄바꿈
		
		int sum2 = 0;
		
		for(int i=1; i<101; i++) {
			sum2 = sum2 + i;                                               
			System.out.println(i + "일때 sum= " + sum2 + "입니다.");      	
		} 
		
		System.out.println("총합= "+ sum2 + "입니다.");  
		
//			sum2 = +i; 중복되는 sum2를 지울 수 있다. 단 작동되지 않는다
//			sum2 + = i; 이항 연산자 인데 피연산자가 없어져 +를 반대편으로 넘긴다.
/*
대입연산자

표를 보고 공부하자

*/
		
	}

}
