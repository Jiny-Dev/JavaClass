package ch05_Array;

//5과목의 시험 성적을 배열에 저장하시오. 총점과 평균을 출력하시오.
public class ArrayEx04 {

	public static void main(String[] args) {
//		값의 목록을 제시하여, 배열 생성하고 참조변수에 주소를 할당
		int[] scores = {90, 70, 100, 50, 30}; //과목별 점수
		int sum = 0;                                       //총점 변수
		
		//과목 수
		System.out.println("과목 수= " + scores.length + "과목");
		
		//과목별 점수
		for(int i=0; i<scores.length;i++) {
			System.out.print((i+1) + "과목= " + scores[i] + "점, ");	
		}
		System.out.println();	
		
		//총점
		for(int i=0; i<scores.length;i++) {
			sum += scores[i];                         //sum = sum + scores[i];
		}
		System.out.println("총점= " + sum + "점");
		
		//평균
		double avg = (double) sum / scores.length;  //평균 변수
		System.out.println("평균= " + avg + "점");
			
	}
}
