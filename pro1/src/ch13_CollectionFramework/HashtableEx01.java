package ch13_CollectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Hashtable (p576)
public class HashtableEx01 {
	public static void main(String[] args) {

		// Hashtable java 코드 작성
		Map<String, String> map = new Hashtable<String, String>();
		map.put("001", "고구마");
		map.put("002", "감자");
		map.put("003", "타로");
		map.put("004", "토란");
		map.put("005", "산마");

		// 특정 key를 사용
		// map참조변수.get(K);
		String name = map.get("003");
		System.out.println(name); 
		
System.out.println("---------------");

		// Iterator 반복자를 이용하여 출력
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next(); //key
			String value = map.get(key); //value
			System.out.println(key + " : " + value);
		}

	}

}
