package ch13_CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import ch06ch07.Bird;

//p565
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
public class SetEx01_p565 {

	public static void main(String[] args) {
		// HashSet을 선언하시오.
		Set set = new HashSet();
//		HashSet set = new HashSet();
//		HashSet set = new LinkedHashSet(); 
		//HashSet을 확장하고 Set 인터페이스를 구현합니다.
		//이 클래스는 집합에 추가된 순서대로 연결 리스트를 유지합니다. 
//		LinkedHashSet set = new LinkedHashSet();
//		Set set = new TreeSet();
		
		//상위클래스 참조변수 = new 하위클래스();
		//인터페이스 참조변수 = new 구현클래스();

		
		// 정수데이터를 저장하는 add()메서드를 5번반복호출
		// 데이터추가-add() 임의 데이터를 추가
		for (int i = 0; i < 5; i++) {
			set.add(i * 12); // 0 12 24 36 48
			// 저장될 때 정수기본형 int => Integer로 Boxing
		}


		// Set collection에는 다양한 타입을 저장할 수 있다.
		set.add(3.14);// 실수 기본형 double => Double
		set.add("String2"); // String
		set.add(true);// 논리 기본형 boolean => Boolean
		set.add(true);// 중복 x 한번만 나옴
		set.add('A');// 문자 기본형 char => character
		set.add(new Bird()); // 사용자 클래스의 객체

		// 데이터가져오기-for문
		//데이터를 add한 순서가 그대로 유지되지 않고 데이터가 출력
		getList(set);

		// 삭제-remove()
		
		// 데이터의 개수 출력
		System.out.println("데이터의 개수 size()= " + set.size());

		//제시한 객체가 remove되었으면 true리턴, 실패시 false 반환
		System.out.println(set.remove("String2"));
		System.out.println(set.remove("string2"));
		
		// 데이터가져오기-Iterator이용
		System.out.println("=== Iterator ===");
		Iterator iterator = set.iterator(); //Iterator는 인터페이스로 컬렉션에서 요소를 순차적으로 반복
		while(iterator.hasNext()) { //while을 이용해 반복 횟수 지정
			Object obj = iterator.next();
			System.out.print(obj+" ");
		}
		System.out.println();
		
		//clear(): 저장된 모든 객체 제거
		set.clear();
		
		//isEmpty(): 빈 컬렉션인지 확인
		System.out.println("clear 후 = "+set.isEmpty());
		
		System.out.println("데이터의 개수 size()= " + set.size());
	}

	// 데이터출력
	public static void getList(Set set) {
		for (Object temp : set) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}

}
