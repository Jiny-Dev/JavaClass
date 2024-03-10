package ch13_CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import ch06ch07.Bird;

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

/*배열- 장점)하나의 변수에 다수개의 data를 저장
     - 단점)선언된 배열의 크기를 변경할 수 없다
           동일한 타입만 가능하다
           연속적인 공간에 저장하므로 중간에 삭제가 되면 이갈이하는 아이처럼 된다 
 */
public class ListEx01_p557 {

	public static void main(String[] args) {
		// ArrayList을 선언하시오.
//		ArrayList arrayList = new ArrayList();
//		아래처럼 하면 더 편하다
		
		//상위클래스 참조변수 = new 하위클래스();
		//인터페이스 참조변수 = new 구현클래스();
		//다형성
//		List arrayList = new ArrayList();
//		List arrayList = new Vector();
		List arrayList = new LinkedList();
//		=> 모두 정상적으로 돌아감 -> 코드의 유연성
		
		
		System.out.println("arrayList=" + arrayList);// arrayList=[]
		int arrLen = arrayList.size(); // 0

		// 정수데이터를 저장하는 add()메서드를 5번반복호출
		// 데이터추가-add() 임의 데이터를 추가
		for (int i = 0; i < 5; i++) {
			arrayList.add(i * 12); // 0 12 24 36 48
			// 저장될 때 정수기본형 int => Integer로 Boxing
		}

		// 특정인덱스에 저장된 데이터가져오기-Object get(인덱스번호)
		System.out.println("0번째에 저장된 데이터=" + arrayList.get(0));
		System.out.print(arrayList.get(0));
		System.out.print(arrayList.get(1));
		System.out.print(arrayList.get(2));
		System.out.print(arrayList.get(3));
		System.out.print(arrayList.get(4));

		// List collection에는 다양한 타입을 저장할 수 있다.
		arrayList.add(3.14);// 실수 기본형 double => Double
		arrayList.add("문자열"); // String
		arrayList.add(true);// 논리 기본형 boolean => Boolean
		arrayList.add(true);// 중복 허용
		arrayList.add('A');// 문자 기본형 char => character
		arrayList.add(new Bird()); // 사용자 클래스의 객체

		// 데이터가져오기-for문
		//데이터를 add한 순서가 그대로 유지되어 데이터가 출력
		getList(arrayList);

		// 변경-set(인덱스번호,값) 가장 첫번째 데이터의 값을 임의데이터로 변경
		arrayList.set(0,2);
		arrayList.set(1,"고양이");
		System.out.println("변경 후 0번째 데이터=" + arrayList.get(0));
		System.out.println("변경 후 1번째 데이터=" + arrayList.get(1));

		// 삭제-remove(인덱스번호)가장 마지막 데이터를 삭제=>여기에서는 초기화
		arrayList.remove(arrayList.size()-1);
		
		// 데이터의 개수 출력
		System.out.println("데이터의 개수 size()= " + arrayList.size());

		//제시한 객체가 remove되었으면 true리턴, 실패시 false 반환
		System.out.println(arrayList.remove("고양이"));
		System.out.println(arrayList.remove("강아지"));
		
		//clear(): 저장된 모든 객체 제거
		arrayList.clear();
		
		//isEmpty(): 빈 컬렉션인지 확인
		System.out.println("clear 후 = "+arrayList.isEmpty());
		
		System.out.println("데이터의 개수 size()= " + arrayList.size());
	}

	// 데이터출력
	public static void getList(List arr1) {
		for (Object temp : arr1) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}

}
