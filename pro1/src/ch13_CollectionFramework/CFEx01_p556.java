package ch13_CollectionFramework;

//p556
//컬렉션 프레임워크

/*배열 - 장점) 하나의 변수에 다수개의 data를 저장
	   	- 단점) 선언된 배열의 크기를 변경할 수 없다.
	   			 동일한 타입만 가능하다
	   			 연속적인 공간에 저장하므로 중간에 삭제가 되면 구멍이 생긴다.
*/
public class CFEx01_p556 {

	public static void main(String[] args) {

		// 임의 정수 데이터 5개를 저장하는 배열 arr1을 선언하시오.
		// 타입[] 참조변수 = new 타입[];
		int arr1[] = new int[5]; // 0, 0, 0, 0, 0
		System.out.println("arr1" + arr1);// arr1[I@6a5fc7f7

		// 데이터 추가-임의 데이터 추가
		int arrLen = arr1.length;
		for (int i = 0; i < arrLen; i++) {
			arr1[i] = (int) (Math.random() * 5 + 1);
		}

		// 데이터 가져오기-for문
		for (int temp : arr1) { // 향상된 for문
			System.out.print(temp + " ");
		}
		System.out.println(); // 줄바꿈

		getList(arr1);

		// 변경-가장 첫번째 데이터의 값을 임의 데이터로 변경
		arr1[0] = 2;

		getList(arr1);

		// 삭제-가장 마지막 데이터를 삭제 => 여기서는 초기화, 현재 실제 삭제 불가, Array List 사용시 가능
		arr1[arrLen - 1] = 0;
		getList(arr1);

		// 데이터의 개수 출력
		System.out.println(arrLen);
		getList(arr1);

	}

	// 데이터 출력
	private static void getList(int[] arr1) { // int[] arr1 => arr1의 주소를 호출
		for (int temp : arr1) {
			System.out.print(temp + " ");
		}
		System.out.println("---------------------");
	}

}
