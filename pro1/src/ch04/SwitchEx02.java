package ch04;

/*
switch(변수명){
	case 값1: 실행코드; break; 
	case 값2: 실행코드; break; 
	case 값3: 실행코드; break; 
	default: 실행코드; break;
	}
	 
*/
public class SwitchEx02 {

	public static void main(String[] args) {
		
		//3,4,5- 봄, 6,7,8, - 여름, 9,10,11 - 가을, 12, 1, 2- 겨울
		//(1~12)임의 정수 값에 따른 달에 따라 계절을 출력하시오.
		
		int month = (int)(Math.random()*12)+1;
		
		switch(month){
			case 3: System.out.println(month + "월: " + "계절은 봄입니다."); break; 
			case 4: System.out.println(month + "월: " + "계절은 봄입니다."); break; 
			case 5: System.out.println(month + "월: " + "계절은 봄입니다."); break; 
			case 6: System.out.println(month  + "월: " + "계절은 여름입니다."); break; 
			case 7: System.out.println(month  + "월: " + "계절은 여름입니다."); break; 
			case 8: System.out.println(month  + "월: " + "계절은 여름입니다."); break; 
			case 9: System.out.println(month  + "월: " + "계절은 가을입니다."); break; 
			case 10: System.out.println(month  + "월: " + "계절은 가을입니다."); break; 
			case 11: System.out.println(month  + "월: " + "계절은 가을입니다."); break; 
			case 12: System.out.println(month  + "월: " + "계절은 겨울입니다."); break; 
			case 1: System.out.println(month  + "월: " + "계절은 겨울입니다."); break; 
			case 2: System.out.println(month  + "월: " + "계절은 겨울입니다."); break; 
			default: System.out.println("알 수 없습니다.");; break;
		}

//		--------------------------------------------------------------------------------------------
		//코드 간소화 시키기 feat. switch의 특징
		
		switch(month){
		case 3:
		case 4:
		case 5: System.out.println(month + "월: " + "계절은 봄입니다."); break; 
		case 6:
		case 7:
		case 8: System.out.println(month  + "월: " + "계절은 여름입니다."); break; 
		case 9:
		case 10: 
		case 11: System.out.println(month  + "월: " + "계절은 가을입니다."); break; 
		case 12:
		case 1:
		case 2: System.out.println(month  + "월: " + "계절은 겨울입니다."); break; 
		default: System.out.println("알 수 없습니다.");; break;
	}
		
//		다음과 같을 때, 실행코드가 없음에도 결과값이 제대로 나온다.
//		break가 있는 곳으로 가기 때문에 3의 값을 입력하면 5까지 가서 봄이 출력되는 것이다.
		
	}

}
