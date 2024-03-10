package ch05_Array;

/*
다차원 배열(p190)
-2차원 이상의 배열
-수학의 행렬과 같은 자료 구조
-'[ ]'의 개수가 차원의 수를 의미
 
가변 배열
-다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정
 
문법
타입[ ] [ ] 배열명;    타입 배열명[ ] [ ];    타입[ ] 배열명[ ];
*/
public class ArrayEx06 {

	public static void main(String[] args) {
		//학생 1명당 n과목 시험
		//3명의 시험 성적을 배열에 저장 하시오.		
/*		다차원 배열에서 마지막 차수의 크기를 지정하지 않고 
		int[][] scores0 = new int[3][];
*/ 
/*		각각 다르게 지정
		score0[0] = new int[5];
		score0[1] = new int[2];
		score0[2] = new int[4];
*/
	
		int[][] scores = {{90, 70, 100, 50, 30}, {30, 50}, {40, 20, 100, 100}};

		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.printf("%d ",scores[i][j]);
			}
			System.out.println();
		}//외부for
		
//		System.out.println("scores[0]="+scores[0]);
//		System.out.println("scores[0].length="+scores[0].length);
//		
//		System.out.println("scores[1]="+scores[1]);
//		System.out.println("scores[1].length="+scores[1].length);
//		
//		System.out.println("scores[2]="+scores[2]);
//		System.out.println("scores[2].length="+scores[2].length);

		
	}

}
