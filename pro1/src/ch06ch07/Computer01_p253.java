package ch06ch07;
//매개변수의 개수를 모를 경우
//방법 1) 배열이용           => 문법 메서드명(타입[] 변수명)
//방법 2) ...사용한 매개변수 => 문법 메서드명(타입 ... 변수명)

public class Computer01_p253 {
	//방법 1) 배열이용           => 문법 메서드명(타입[] 변수명)
	int sum1(int[] values) {
		int result = 0;
		for(int i = 0; i<values.length; i++) {
			result += values[1];
		}
		return result;
	}
	
	
	//방법 2) ...사용한 매개변수 => 문법 메서드명(타입 ... 변수명)
	int sum2(int...values) {
		int result = 0;
		for(int i = 0; i<values.length; i++) {
			result += values[1];
		}
		return result;
	}

}
