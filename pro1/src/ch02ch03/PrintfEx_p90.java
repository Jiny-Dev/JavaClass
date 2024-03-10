package ch02ch03;

//printf(p90)
//printf()
public class PrintfEx_p90 {

	public static void main(String[] args) {
		String name = "홍길동";
		long age4 = 25;
		double height = 180.5;
		
		System.out.println(name+age4+height); 
		//(name+""+age4+""+height): 값 사이에 공백, (name+"\t"+age4+"\t"+height): Tab을 사용한 공백 효과
		
		System.out.printf("%s\t%d\t%f",name,age4,height); 
		// "%s\t%d\t%f" => 문자열+공백+정수+공백+실수                                  (p91)
		System.out.println();
		
		System.out.printf("%s\t%d\t%.3f",name,age4,height); 
		// 실수 소수점 조정 %f에서 %.자리수f로 입력
		System.out.println();
	
		System.out.printf("%10s%5d%10.3f\n","abc",123,120.55); 
		System.out.printf("%10s%5d%10.3f\n","abcd",123,120.55); 
		System.out.printf("%10s%5d%10.3f\n","abcde",123,120.55); 
		System.out.printf("%10s%5d%10.3f\n","abcdef",123,120.55); 
		System.out.println();
		
		
		System.out.println("println 이름:"+name);
		System.out.print("print 이름:"+name+"\n");
		System.out.print("print 이름:");
		System.out.print(name+"\n");
		System.out.printf("%s", name+"\n");
		System.out.printf("printf 이름:%s\n", name);
		
		byte age1 = 25;
		System.out.print(age1);
		short age2 = 25;
		System.out.print(age2);
		int age3 = 25;
		System.out.print(age3);
		
//		long age5 = 25;
//		System.out.printf(age5);
//The method printf(String, Object...) in the type PrintStream is not applicable for the arguments (long)
//문법에 맞지 않다(입력된 매개 변수가 1개이기 때문) 
		
		long age5 = 25;
		System.out.printf("%d", age5);
		long age6 = 25;
		System.out.printf("printf 나이:%d", age6);
		
		
	
		
		
	}

}
