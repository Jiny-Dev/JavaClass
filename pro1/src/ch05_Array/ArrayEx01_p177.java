package ch05_Array;

/*배열이란?(p177)
-같은 타입의 데이터를 연속된 공간에 저장하는 자료구조 
-각 데이터 저장 위치는 인덱스 부여해 접근

배열의 장점
-중복된 변수 선언 줄이기 위해 사용
-반복문을 이용해 요소들을 쉽게 처리

배열의 단점
-동일 타입만 가능 //int에 char을 넣을 수 있다. 아스키 코드로 저장, 같은 정수라도 크기가 달라 불가능하다.
-배열의 크기를 정정할 수 없다.

배열선언
형식>타입[] 배열변수명;
형식>타입   배열변수명[];

배열생성
방법1.값 목록으로 배열 생성하는 방법
	1)변수 선언과 동시에 값 목록 대입    //int score =100;
	2)변수 선언 후 값 목록 대입                //int score; ~score = 100;
방법2.new 연산자로 배열 생성
-배열 생성시 값 목록을 가지고 있지 않음
-향후 값들을 저장할 배열을 미리 생성하고 싶을 경우

배열의 길이: 배열에 저장할 수 있는 전체 항목 수
-배열명.length
 */

public class ArrayEx01_p177 {

	public static void main(String[] args) {
/* 	다음을 배열로 정리
		int score0 = 100;
		int score1 = 90;
		int score2 = 80;
		int score3 = 70;
		int score4 = 60;
*/
		
		//배열선언
		//int[] scores;             //형식>타입[]   배열변수명;
		//int   scores[];           //형식>타입     배열변수명[];
		
		//1.값 목록으로 배열 생성하는 방법
		//1)변수 선언과 동시에 값 목록 대입
		int[] scores = {100, 90, 80, 70, 60, 88, 99}; 
		int arrLen = scores.length;
		
		System.out.println("배열 길이= "+scores.length); //값과 자리수가 다를 시 예외 오류가 발생 
		System.out.println(scores[0]);
		int score = scores[1];
		System.out.println(score);
		score = scores[2];
		System.out.println(score);
		score = scores[3];
		System.out.println(score);
		score = scores[4];
		System.out.println(score);
		
		System.out.println("-----for문으로 바꿔보자-----");
		
		for(int i = 0; i<7 ; i++){                       // 0~4
			System.out.println(scores[i]);
		}
		
		for(int i = 0; i<scores.length ; i++){  //scores.length 통해 값의 개수(길이)가 늘어나도 오류가 나지 않는다.      
			int score2 = scores[i];
			System.out.println(score2);
		}
//		System.out.println("-----변수의 값 변경-----");
			
		scores[0] = 200; //위에서 100으로 지정했으나 새로 선언하여 교체
		scores[1] = 290;
		System.out.println("-----변수의 값 변경 후 출력-----");
		for(int i = 0; i<7 ; i++){                       // 0~4
			System.out.println(scores[i]);
		}
		
//		배열에는 for문과 length가 많이 사용된다.
		
		System.out.println("-----향상된 for문으로 바꿔보자-----");
//		짧음에도 반복을 실행한다
//		for(타입 변수명 : 컬렉션명) {}
//		for(타입 변수명 : 배열명) {}
		for(int score2 : scores) {
			System.out.println(score2);
		}
	}

}

