package ch13_CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//p564
/*ArrayList vs. LinkedList – 성능 비교
-순차적으로   데이터를 추가/삭제 - ArrayList가 빠름
-비순차적으로 데이터를 추가/삭제 - LinkedList가 빠름
-접근시간(access time)      - ArrayList가 빠름    */
public class ArrayListvsLinkedList {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		LinkedList lList= new LinkedList();
		
		//순차적으로 추가
		System.out.println("\n-순차적으로 추가------------------");
		System.out.println("ArrayList실행시간="+ add1(aList)  );
		System.out.println("LinkedList실행시간="+ add1(lList) );
		
		//접근시간(access time) 조회
		System.out.println("\n-접근시간 조회------------------");
		System.out.println("ArrayList접근시간="+ access(aList)  );
		System.out.println("LinkedList접근시간="+ access(lList) );
		
		
		
		
/*		//중간에    추가
		System.out.println("\n-중간에 추가------------------");
		System.out.println("ArrayList실행시간="+ add2(aList)  );
		System.out.println("LinkedList실행시간="+ add2(lList) );
		
		//중간에    삭제
		System.out.println("\n-중간 삭제------------------");
		System.out.println("ArrayList실행시간="+ remove2(aList)  );
		System.out.println("LinkedList실행시간="+ remove2(lList) );

		//순차적으로 삭제-여기에서는 뒤에서부터 순차적으로 삭제
		System.out.println("\n-순차적 삭제------------------");
		System.out.println("ArrayList실행시간="+ remove1(aList)  );
		System.out.println("LinkedList실행시간="+ remove1(lList) );
 */

	}
	//접근시간(access time) 조회
	private static long access(List list) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<200000;i++){ list.get(i);   }
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	
	//순차적으로 추가
	static long add1(List list) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<2000000;i++){ list.add(i);   }
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	//중간에 추가 -여기에서는 인덱스가 300인 위치에 "Z"를 추가
	static long add2(List list) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<2000;i++){ list.add(300,"Z");   }
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	//순차적으로 삭제
	static long remove1(List list) {
		long startTime = System.currentTimeMillis();
		for(int i=list.size()-1;i>=0;i--){ list.remove(i);   }
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	//중간에    삭제
	static long remove2(List list) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<2000;i++){ list.remove(i);   }
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}

}






