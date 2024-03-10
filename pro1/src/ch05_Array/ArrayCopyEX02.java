package ch05_Array;

public class ArrayCopyEX02 {

	public static void main(String[] args) {
		//얕은 복사(shallowCopy)
		int [] a=null; //지역변수는 반드시 초기화 하여야 한다
		{
				int [] b;  //b는 중괄호 안에 묶인 지역변수 => 지역을 벗어나면 사용 불가
				b = new int[5]; //new를 사용하면 heap 영역에 생성된다.=>프로그램이 끝나야 없어진다.
				b[0] = 100;
				a = b;    //a는 main 메소드 내 전역에서 사용할 수 있어 b 주소를 넣을 수 있다.
		}                    //얕은 복사                           
		System.out.println("a="+a);
		System.out.println(a[0]);//a에 값을 주지 않아도 b 주소에 있0는 값을 가져온다.
		//변수 a를 통해서 b의 주소에 접근하여 작업을 실행한다.
//		System.out.println("b="+b); //error, 선언한 영역을 벗어남
		
		
		
	}

}
