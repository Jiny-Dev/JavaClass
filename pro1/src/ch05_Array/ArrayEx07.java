package ch05_Array;

//0~100
//5개의 임의 데이터를 랜덤하게 배열 저장 후 가장 큰 수를 출력하는 프로그램 구현
public class ArrayEx07 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 10;
		int temp = 0; //두개의 값을 바꾸는데 사용할 임시 변수
		if(a>b) { 
			temp=a;
		}else {
			temp = b;
		}
		System.out.println("큰 수= "+ temp);
		
	}

}
