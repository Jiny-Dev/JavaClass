package ch13_CollectionFramework;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//여기에서는 StudentDTO를 List,Set,Map넣고 출력하는 실습
/* 클래스    참조변수 = new    클래스명();
   상위클래스 참조변수 = new 하위클래스명();
   인터페이스 참조변수 = new 구현클래스명();
 */
public class CFEx02_withDTO {

	public static void main(String[] args) {
		System.out.println("=List에 StudentDTO객체 추가===");
		//List에 StudentDTO객체를 추가
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		StudentDTO s1 = new StudentDTO("0012345","홍GD",new Date());
		//System.out.println("s1="+s1);
		//System.out.println("s1.toString()="+s1.toString());
		list.add(s1);
		list.add(new StudentDTO("0012346","세종대왕",new Date()));
		list.add(new StudentDTO("0012347","이순신",new Date()));
		
		//콘솔출력
		for(int i=0;i<list.size() ;i++) {
			StudentDTO studentDto= list.get(i);
			System.out.println("studentDto="+studentDto);
//			System.out.println(studentDto.getStuNo());
//			System.out.println(studentDto.getStuName());
//			System.out.println(studentDto.getEnrollmentDate());
		}
		
		System.out.println("\r\n=Set에 StudentDTO객체 추가===");
		//Set에 StudentDTO객체를 추가
		Set<StudentDTO> set = new HashSet<StudentDTO>();
		//여기에서는 기본생성자를 이용해서 객체를 생성->필드 초기
		StudentDTO sDto1 = new StudentDTO();
		//setter()를 이용해서 필드값을 설정
		sDto1.setStuNo("0022225");
		sDto1.setStuName("진1");
		sDto1.setEnrollmentDate(new Date());
		set.add(sDto1);
		
		//2번째 학생
		StudentDTO sDto2 = new StudentDTO();
		sDto2.setStuNo("0022226");
		sDto2.setStuName("진2");
		sDto2.setEnrollmentDate(new Date());
		set.add(sDto2);
		
		//3번째 학생
		StudentDTO sDto3 = new StudentDTO();
		sDto3.setStuNo("0022227");
		sDto3.setStuName("진3");
		sDto3.setEnrollmentDate(new Date());
		set.add(sDto3);
		
		for(StudentDTO studentDto:set) {
			System.out.println(studentDto);
		}
		
		//System.out.println("\r\n=Map에 StudentDTO객체 추가===");
		//Map에 StudentDTO객체를 추가
		
		Map<String, StudentDTO > map01 = new HashMap<String, StudentDTO>();
		map01.put("1", new StudentDTO("333", "고라니",  new Date() ));
		
		StudentDTO sDto= new StudentDTO();
		sDto.setStuNo("00123456");
		sDto.setStuName("고고라니");
		sDto.setEnrollmentDate(new Date());
		map01.put("2", sDto);
		
		map01.put("3", sDto); // map의 value는 중복 가능
		
		
//		StudentDTO sDto3 = new StudentDTO();
//		sDto3.setStuNo("0022227");
//		sDto3.setStuName("진3");
//		sDto3.setEnrollmentDate(new Date());
//		set.add(sDto3);
		
		Set<String> keys = map01.keySet();
		Iterator<String> keysIterator = keys.iterator();
		while(keysIterator.hasNext()) {
			String key = keysIterator.next();
			StudentDTO value = map01.get(key);
			System.out.println("저장된 key: " + key + "   저장된 value: " + value);
		}
		
		
		
	}

}
