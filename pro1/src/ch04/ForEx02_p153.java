package ch04;

//구구단 출력
/*
 5단
 5*1=5
 :
 5*9=45

*/

public class ForEx02_p153 {

	public static void main(String[] args) {
		
/*		//구구단 계산기 만들기
		int dan = 5;
		for(int i =1; i<10; i++){
			System.out.println(dan + "*"+ i + "=" + (dan*i));
		}
*/
		
		System.out.println("__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--");
		
		//2단 ~ 9단 구구단 계산기 만들기
		for(int i = 2;i<10;i++) {
//			int dan = 2; //위에서 해당 for문안에 이미 선언 하였다
			System.out.println("- " + i + "단 출력 -");
			for(int j =1; j<10; j++){
				System.out.println(i + "*"+ j + "=" + (i*j));
			}//내부 for
			System.out.println();
		}//외부 for
		
		System.out.println("__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--");

	}

}
