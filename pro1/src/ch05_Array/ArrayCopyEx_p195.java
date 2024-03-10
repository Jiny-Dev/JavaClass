package ch05_Array;

import java.util.Arrays;

/*배열 복사(p195)
-배열은 한 번 생성하면 크기 변경 불가
-더 많은 저장 공간이 필요하다면 
 보다 큰 배열을 새로 만들고 이전 배열로부터 항목 값들을 복사

*배열 복사 방법
-for문 이용
-System.arrayCopy() 메소드 이용
-Arrays 클래스 이용

*얕은 복사(shallowCopy): 주소 복사
-원본배열의 참조(주소)를 복사하여 
  원본배열과 복사 배열은 동일한 메모리 주소를 reference한다.
 -원본배열의 요소를 변경하면 영향을 받는다.
*깊은 복사(deepCopy): 값 복사
-원본배열의 모든 요소를 새로운 배열로 복사
-원본배열의 요소를 변경해도 영향을 받지x
*/
public class ArrayCopyEx_p195 {

	public static void main(String[] args) {
		int[] arr1 = {10, 11, 12, 13, 14, 15};
		
//		System.out.println(arr1);//주소 확인
		String result = Arrays.toString(arr1);
		System.out.println("arr1=" + result);

		
		int[] shallowCopy = arr1;
		//얕은 copy:주소 복사
		int [] deepCopy = Arrays.copyOf(arr1, arr1.length);
		//깊은 copy값 복사
		
		System.out.println("shallowCopy=" + Arrays.toString(shallowCopy));
		System.out.println("deepCopy=" + Arrays.toString(deepCopy));
		
		System.out.println("-----원본 배열의 값 변경-----");
		arr1[0] = 100;
		
		System.out.println("-----원본 배열의 값 변경 후-----");
		System.out.println("원본 arr1=" + Arrays.toString(arr1));
		System.out.println("shallowCopy=" + Arrays.toString(shallowCopy));
		System.out.println("deepCopy=" + Arrays.toString(deepCopy));
		
		System.out.println("-----배열 주소-----");
		System.out.println("원본 arr1=" + arr1);
		System.out.println("shallowCopy=" + shallowCopy);
		
		
		
	}

}
