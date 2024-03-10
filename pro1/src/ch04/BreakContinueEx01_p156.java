package ch04;

/*
Break(p156)
-반복문 for문, while문, do-while문 종료(반복 취소)
-조건문 switch문 종료
-대개 if문과 같이 사용
-if문 조건식에 따라 for문과 while문 종료시 사용
 */
/*
continue(p158)
-반복문 for문, while문, do-while문에서 사용
-for문: 증감식으로 이동
- while문, do-while문: 조건식으로 이동
 */

public class BreakContinueEx01_p156 {

	public static void main(String[] args) {
		
		//while문 - 1 2 3 4 . . . 10 출력
		int i =1;
		
		while(i<11) {
			System.out.println(i);
			if(i==5) {
				System.out.println("\tif문 i ="+i);
				break;
			}//if 끝
			i++;
		}//while 끝
		System.out.println("while 밖");
		
		System.out.println("------------------------------아래는 continue--------------------------------");
		
/*		int j =1;
		
		while(j<11) {
			System.out.println(j);
			if(j==5) {
				System.out.println("\tif문 j ="+j);
				continue;
			}//if 끝
			j++;                      //j++까지 도착하지 못해 반복된다.
		}//while 끝
		System.out.println("while 밖");
*/		
		int j =1;
		
		while(j<11) {
			System.out.println(j);
			j++;                      //위치를 바꾸면 출력된다.
			if(j==5) {
				System.out.println("\tif문 j ="+j);
				continue;
			}//if 끝 
			System.out.println("아직 while문 내부야");
		}//while 끝
		System.out.println("while 밖");
	
		
	}//main 끝

}

//다른 대입 연산자를 사용해도 되며, 여러 개의 변수 사용 가능하다.
