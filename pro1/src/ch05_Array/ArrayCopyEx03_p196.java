package ch05_Array;

import java.util.Arrays;

//깊은 복사의 예
public class ArrayCopyEx03_p196 {

	public static void main(String[] args) {
		int[] arr1 = {11,12,13,14,15};	
		System.out.println("원본arr1="+Arrays.toString(arr1));
			
		//배열복사 - System.arrayCopy()메소드 이용
		int[] newArr = new int[10];
		System.out.println("복사 전newArr="+Arrays.toString(newArr));
		System.arraycopy(arr1, 1, newArr, 5, 4);//length 위치에 arr1.length-1등을 넣어도 된다 (arr1, 1, newArr, 5, arr1.length-1);
		//원본배열 arr1[1]부터 4개를 복사하여 사본배열 newArr[5]부터 붙여라
		System.out.println("복사 후newArr="+Arrays.toString(newArr));
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
/*		src - 원본배열
		srcPos - 원본배열의 (복사)시작위치
		dest - 사본배열
		destPos - 사본배열의 (복사)시작위치
		length - 원본배열의 복사 개수
*/		
	}

}
