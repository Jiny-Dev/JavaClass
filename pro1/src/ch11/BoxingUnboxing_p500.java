package ch11;

//Wrapper class(p498)
//p500
//Boxing - 기본타입의 값을 포장객체로 만드는 가정
//Unboxing - 포장객체에서 기본타입의 값을 얻어 내는 과정
public class BoxingUnboxing_p500 {

	public static void main(String[] args) {
		
		int n = 100;
		//Boxing
		//생성자  constructor: 클래스와 메서드의 이름이 같을 때
		//new Integer() Integer 클래스의 객체(object)를 생성
		//Integer obj1 Integer 클래스 타입의 obj1  변수 선언
		Integer obj1 = new Integer(100); 
		// obj1에 객체가 들어가 진다
		
		System.out.println(obj1);
		//System.out.println(n);과의 차이
        //무엇인가 더 많이 할 수 있다. 
		//n 뒤에 . 찍어도 변화 없으나 obj1 뒤에 찍으면 많은 것이 나오는 것의 차이
		
//		int x = 100;
		int x = obj1;  //auto-Unboxing
		// 자동 형변환 되었다. 다시 정의해도 아무런 방해없이 컴파일 됨
		System.out.println(x);
		
/*Integer obj1 포장객체였던 것이
 *int x = obj1; 를 통해서 자동 언박싱 됨	
 *System.out.println(x); x뒤에 점을 찍어도 부가 기능 없음
 *이는 곧 자동 형변환이 이루어졌다
 */
		
		Integer obj2 = n; // 기본타입 n 을 Integer로 포장함: auto-Boxing
		System.out.println(obj2);
		
		
		
	}

}
