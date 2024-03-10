package ch13_CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		// 클래스 참조변수 = new 클래스타입();
		// 상위클래스 참조변수 = new 하위클래스();
		// 인터페이스 참조변수 = new 구현클래스();

		// HashMap map = new HashMap(); //클래스 참조변수 = new 클래스타입();
		// Map map = new HashMap(); // 인터페이스 참조변수 = new 구현클래스();
		Map<Object, Object> map = new HashMap<Object, Object>(); // 제너릭 사용으로 타입을 지정해서 노란줄 없앰
		System.out.println("map= " + map); // { }
		System.out.println("size()=" + map.size()); // 0 저장된 객체 수 확인

//		 put(Object K, Object V) 키, 값 추가
		// Value는 중복 허용
		map.put(1, 100); // map.put(new Integer(1), new Integer(100));으로 자동형변환
		map.put(2.0, 100); // map.put(new Double(2.0), new Integer(100));으로 자동형변환
		map.put(true, "문자열"); // map.put(new Boolean(true), new String("문자열"));으로 자동형변환
		map.put('A', 'Z'); // map.put(new Character('A'), new Character('z'));으로 자동형변환
		// -> 자동형변환이 계속 일어남

		System.out.println("size()=" + map.size()); // 저장된 키의 총 수

//		Object get(Object K) 키를 이용하여 값을 가져오기
		Object v1 = map.get(1);
		System.out.println(v1); // Object 100
		int hashCode = v1.hashCode();
		System.out.println(hashCode); // 100

		System.out.println(map.get(2.0)); // HashCode 100
		System.out.println(map.get('A')); // HashCode Z

//		Object remove(Object K); 키를 이용하여 값을 삭제
		// 해당하는 키를 찾을 수 없으면 null 리턴
		Object v3 = map.remove('A');
		System.out.println(v3); // 삭제 하였지만 삭제 이전의 값을 준다.
		Object v4 = map.remove('a');
		System.out.println(v4); // 값이 없어 null을 준다.

//		boolean containsKey(Object K)주어진 키가 있는지 여부
		// 주어진 키가 있으면 true

		boolean r = map.containsKey(2.0);
		if (r) {
			map.remove(2.0);
			System.out.println("삭제되었어요");
		} else {
			System.out.println("삭제 실패!!!");
		}
		System.out.println("size()=" + map.size()); // 저장된 키의 총 수

//		Set<Object> keySet() 모든 Key를  Set 객체에 담아서 return //<Object>제너릭을 위에서 사용해서 들어감
		System.out.println("\n--------- key만 출력 ---------");
		Set<Object> keySet = map.keySet();
		Iterator<Object> iter = keySet.iterator(); // 여러개 뽑아야 하니까 iterator()로

		while (iter.hasNext()) {
			Object key = iter.next(); // key만 조회
			Object value = map.get(key);// Object get(Object K) 키를 이용하여 값을 가져오기
			System.out.println("저장된 key: " + key + "   저장된 value: " + value);
		}

//		객체를 하나씩 처리한다(p574 38~) //포장이 한번 더 되어있다.
		System.out.println("\n======= entrySet ========");
		Set<Entry<Object, Object>> entrySet = map.entrySet();
		Iterator<Entry<Object, Object>> entryIter = entrySet.iterator();

		while (entryIter.hasNext()) {
			Map.Entry<Object, Object> entry = entryIter.next();
			Object key = entry.getKey(); // key만 조회
			Object value = entry.getValue();// Object get(Object K) 키를 이용하여 값을 가져오기
			// Entry 인터페이스는 위와 조금 다른 문법이다.
			System.out.println("저장된 key: " + key + "   저장된 value: " + value);
		}

		// 모든 객체 제거
		map.clear();

		System.out.println("\nclear() 진행 완료");

		if (map.isEmpty()) {
			System.out.println("Collection이 비어있습니다.");
		} else {
			System.out.println("Collection이 비어있지 않습니다.");
		}

	}

}