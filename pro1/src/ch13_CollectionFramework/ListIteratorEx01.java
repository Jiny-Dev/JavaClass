package ch13_CollectionFramework;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

/*Enumeration, Iterator, ListIterator
- 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
- Enumeration은 Iterator의 구버젼
- ListIterator는 Iterator의 접근성을 향상시킨 것 (단방향 → 양방향)

*Enumeration 
 - boolean hasNextElement(), Object nextElement()
*Iterator
 - boolean hasNext(), Object next() 
 */

public class ListIteratorEx01 {

	public static void main(String[] args) {
		List list0 = new ArrayList();
		list0.add("11");
		list0.add("12");
		list0.add("13");
		list0.add("14");
		list0.add("15");

		System.out.println("Iterator의 hasNext(), next()이용");
		Iterator it2 = list0.iterator();
		while (it2.hasNext()) { // 막약 회원의 수가 지속적을 증가하고 있으며 이를 알 수 없어 반복문 while을 사용한다.
			System.out.println(it2.next());
			
		/*	Object o = it.next();
			String s = (String) o; // 강제타입변환 다운캐스팅
			System.out.println(s.length()); // String 클래스의 필드와 메소드를 사용할 수 있다.
		*/
		}
		
//		Iterator는 단방향으로만 이동되기 때문에
//		컬렉션의 마지막 요소에 다다르면 더 이상 사용할 수 없다.
//		System.out.println("Iterator의 hasPrevious(), previous()");
//		while(it2.hasPrevious()) {
//			System.out.println(it2.previous());
//		}

System.out.println("=================================");		
		

/*		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5"); */

		List<String> list = new ArrayList<String>();
		//<>는 웹에서 쓰이는 태그, 안에 들어가는 것을 요소. Element라 한다.
		//<여는태그>내용<닫는태그>
		list.add("1"); // 괄호안의 내용 또한 요소라 한다.
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		//list.add(5);
		//list.add(true);
		//위와 달리 노란 줄이 사라진다. 타입을 String으로 제한하였다.
		//문자열 이외의 것을 넣으면 오류
		
		
		System.out.println("String으로 받았어유");
		for(String data : list) { //Type mismatch: cannot convert from element type String to data
			System.out.println(data.length());
		}
		
		
//		ListIterator는 양방향 이동이 자유롭다
		System.out.println("ListIterator의 hasNext(), next()이용");
		ListIterator it = list.listIterator();
		while (it.hasNext()) { //순방향
			System.out.println(it.next());
			
		/*	Object o = it.next();
			String s = (String) o; // 강제타입변환 다운캐스팅
			System.out.println(s.length()); // String 클래스의 필드와 메소드를 사용할 수 있다.
		*/
		}
		
		System.out.println("ListIterator의 hasPrevious(), previous()");
		while(it.hasPrevious()) { //역방향
			System.out.println(it.previous());
		}
		
	}

}
