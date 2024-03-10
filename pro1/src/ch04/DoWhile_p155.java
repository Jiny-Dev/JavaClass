package ch04;

/*
//while
while(조건){
조건만족시 실행코드
}

//do-while
do{
실행zhem
} while(조건);
*/

public class DoWhile_p155 {

	public static void main(String[] args) {
		int input = 0;
		
		/*//원본이 되는 while
		 * while(input!=-1) { System.out.println("-1이 아니어서 실행하지 않습니다."); input--; }
		 * System.out.println("while 밖");
		 */
		
		do {
			System.out.println("do-while 안");
			input--;
		}while(input!=-1);
		
		System.out.println("do-while 밖");
		
	}

}
