package ch13_CollectionFramework;

import java.util.Vector;

//p556
/*컬렉션프레임워크(Collection Framework)
-객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리
-java.util 패키지에 포함
-인터페이스를 통해서 정형화된 방법으로 
다양한 컬렉션 클래스 이용

*List 컬렉션의 특징 및 주요 메소드
-특징 : 인덱스로 관리, 중복해서 객체 저장 가능
-구현클래스 : Vector, ArrayList, LinkedList

*Set 컬렉션의 특징 및 주요 메소드
-특징 : 수학의 집합에 비유, 
저장 순서가 유지되지 않음, 객체를 중복 저장 불가
하나의 null만 저장 가능
-구현 클래스 : HashSet, LinkedHashSet, TreeSet
-전체 객체 대상으로 한 번씩 반복해 가져오는 반복자(Iterator) 제공
인덱스로 객체를 검색해서 가져오는 메소드 없음
*Map 컬렉션의 특징 및 주요 메소드
-특징:키(key)와 값(value)으로 구성된 Map.Entry 객체를 저장하는 구조
키와 값은 모두 객체
키는 중복될 수 없지만 값은 중복 저장 가능
-구현 클래스: Hashtable,HashMap,LinkedHashMap,Properties, TreeMap
*/

/*Vector의 생성자
Vector()
Vector(int initialCapacity)
Vector(int initialCapacity, int capacityIncrement)

*/
public class VectorEx01 {

	public static void main(String[] args) {
		/*
		 * // Vector() : 초기용량 10. 용량이 다 차면 2배씩 자동 증가 // List vector = new Vector(); //가능
		 * Vector vector = new Vector(); System.out.println("new Vector()= " + vector);
		 * System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		 * System.out.println("size()= " + vector.size()); // 저장된 데이터의 수
		 * 
		 * // value 추가 System.out.println("value를 10개 추가"); for (int i = 1; i <= 10;
		 * i++) { vector.add(i); } System.out.println("vector의 값 출력()= " + vector); //
		 * 값을 알려줘 System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		 * System.out.println("size()= " + vector.size()); // 저장된 데이터의 수
		 * 
		 * // value 더 추가 System.out.println("value를 5개 더 추가"); for (int i = 1; i <= 5;
		 * i++) { vector.add(i); } System.out.println("vector의 값 출력()= " + vector); //
		 * 값을 알려줘 System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		 * System.out.println("size()= " + vector.size()); // 저장된 데이터의 수
		 */

		System.out.println("===================================");

		/*
		 * // Vector(int initialCapacity) : 초기용량 지정. 용량이 다 차면 2배씩 자동 증가 Vector vector =
		 * new Vector(5); System.out.println("new Vector()= " + vector);
		 * System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		 * System.out.println("size()= " + vector.size()); // 저장된 데이터의 수
		 * 
		 * // value 추가 System.out.println("value를 10개 추가"); for (int i = 1; i <= 10;
		 * i++) { vector.add(i); } System.out.println("vector의 값 출력()= " + vector); //
		 * 값을 알려줘 System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		 * System.out.println("size()= " + vector.size()); // 저장된 데이터의 수
		 * 
		 * // value 더 추가 System.out.println("value를 19개 더 추가"); for (int i = 1; i <= 19;
		 * i++) { vector.add(i); } System.out.println("vector의 값 출력()= " + vector); //
		 * 값을 알려줘 System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		 * System.out.println("size()= " + vector.size()); // 저장된 데이터의 수
		 */

		System.out.println("===================================");

		// Vector(int initialCapacity, int capacityIncrement) : 초기용량 지정, 용량증가 지정
		Vector vector = new Vector(5,10);
		System.out.println("new Vector()= " + vector);
		System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		System.out.println("size()= " + vector.size()); // 저장된 데이터의 수

		// value 추가
		System.out.println("value를 10개 추가");
		for (int i = 1; i <= 10; i++) {
			vector.add(i);
		}
		System.out.println("vector의 값 출력()= " + vector); // 값을 알려줘
		System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		System.out.println("size()= " + vector.size()); // 저장된 데이터의 수

		// value 더 추가
		System.out.println("value를 19개 더 추가");
		for (int i = 1; i <= 19; i++) {
			vector.add(i);
		}
		System.out.println("vector의 값 출력()= " + vector); // 값을 알려줘
		System.out.println("capacity()= " + vector.capacity()); // 용량을 알려줘
		System.out.println("size()= " + vector.size()); // 저장된 데이터의 수

	}

}

//정해진 용량을 넘을 수 없는 배열과는 다르게 지정하거나 자동으로 용량을 무한하게 증가시킬 수 있다.