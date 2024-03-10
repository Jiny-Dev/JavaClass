package ch05_Array;

/*
다차원 배열(p190)
-2차원 이상의 배열
-수학의 행렬과 같은 자료 구조
-'[ ]'의 개수가 차원의 수를 의미
 
문법
타입[ ] [ ] 배열명;    타입 배열명[ ] [ ];    타입[ ] 배열명[ ];
*/
public class ArrayEx05_p190 {

	public static void main(String[] args) {
		//학생 1명당 5과목 시험
		//3명의 시험 성적을 배열에 저장 하시오.
//		int[] score0 = new int[];
		/* scores0[0] {[0][0], [0][1], [0][2], [0][3], [0][4],} 	 //2차원 안의 [][]는 1차원 배열 주소이다.
		 	scores0[1] {[1][0], [1][1], [1][2], [1][3], [1][4],} 	 //주소가 저장되어 있으며, 내부에 리터럴	 
			scores0[2] {[2][0], [2][1], [2][2], [2][3], [2][4],} 		 
		 */
		int[][] scores = {{90, 70, 100, 50, 30}, {30, 50, 90, 100, 50}, {40, 20, 100, 100, 70}};

		//선생님 풀이 - 학생별 점수 //scores[1] [0] [1] [2] < 3
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%d ",scores[i][j]);
			}
			System.out.println();
		}//외부for
		
		
		//학생 수
		System.out.println("학생 수= " + scores.length + "명");

		//과목 수
		for(int i =0; i<scores.length;i++) {
			System.out.println((i+1)+"학생의 과목 수= " + scores[i].length+ "과목");
		}
		
		//과목별 점수
		for(int i=0; i<scores.length;i++) {
			System.out.print((i+1) + "과목= " + scores[i] + "점, ");	
		}
//		
//		//총점
//		for(int i=0; i<scores.length;i++) {
//			sum += scores[i];                         //sum = sum + scores[i];
//		}
//		System.out.println("총점= " + sum + "점");
//		
//		//평균
//		double avg = (double) sum / scores.length;  //평균 변수
//		System.out.println("평균= " + avg + "점");
	}

}
