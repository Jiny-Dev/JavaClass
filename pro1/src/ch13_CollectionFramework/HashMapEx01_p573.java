package ch13_CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01_p573 {
	// field
	// constructor
	// method
	// 인터페이스 참조변수 = new 구현클래스명();
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("이순신", 80);
		map.put("김구", 60);
		map.put("세종대왕", 100);
		map.put("광개토대왕", 40);
		map.put("손흥민", 30);
		map.put("손흥민", 99);//키가 중복되면 마지막 값으로 덮어 씌운다.

		// 객체찾기
		System.out.println(map.get("이순신"));

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}

	}

}