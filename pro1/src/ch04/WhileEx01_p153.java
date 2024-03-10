package ch04;

/*
while(p153) - 반복 횟수가 예측 불가일 경우

while(조건){                          조건 밖에 없기 때문에 선언과 루프에 빠질 수 있어 증감식 필요
	반복 실행 코드
}
-----------------------------------------------
for(타입 변수명 = 초기값; 조건; 증감식){
	반복 실행 코드
}
 */

public class WhileEx01_p153 {

	public static void main(String[] args) {

		//1 2 3 4 5 출력
		for(int i=1;i<6;i++){               //변수 선언; 조건; 증감식
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------");
		
		//1 2 3 4 5 출력
		int i1=1;                                     //변수 선언
		
		while(i1<6){  							 //조건
			System.out.println(i1);   		 
			i1++; 									 //증감식
		}
		
		System.out.println("-----------------------------------------");
		
		//5 4 3 2 1 출력
		int j=5;                                   //변수 선언
		
		while(j>0){  							 //조건
			System.out.println(j);   		 
			j--; 									 //증감식
		}
		
		System.out.println("-----------------------------------------");
		
		// 1+2+ 3+ 4+ 5 총합 출력
		int sum=0;                                   //변수 선언
		int k=1;
		
		while(k<6){  							 //조건
			sum += k; 
			k++; 									 //증감식
		}
		System.out.println(sum);
		
	}

}
