package ch04;


/*if문
 
 if(조건1){
 	조건1 충족 시 실행 코드
 }else{
 	조건 미충족 시 실행 코드
 }	
 ---------------------------------------------
 if(조건1){
 	조건1 충족 시 실행 코드
 }else if(조건2){
 	조건2 충족 시 실행 코드
 }else if(조건3){
 	조건3 충족 시 실행 코드
 }else{
 	위의 모든 조건 미충족 시 실행 코드
  }
 */
public class IfEx01_p135 { 
//**********전역변수 또는 필드

	public static void main(String[] args) { 
//**********지역변수
		
//		선언 위치에 따라 변하는 변수
//		*Global Variable 전역변수: 두 종류가 있다
//		클래스 내 선언한 변수(클래스 내부 모든 메소드에서 사용 가능)
//		- 객체 변수: 같은 클래스 내부에서만 사용 가능
//		int localVar = 1;
//		String localVar = "local"'
//		- 클래스 변수: 다른 클래스에서도 사용 가능
//		static int localVar = 1;
//		static String localVarstr = "local";
		
//	    *Local Variable 지역변수
//		메소드 블럭 내  선언한 변수(선언된 블록 내부에서만 사용 가능)
//		초기 값이 반드시 있어야 함
		
		String name = "ooo";
		String result = null; //String(참조형)의 자동 초기값 null
		result = "";
		char grade = ' '; //char타입의 자동 초기값 공백
		int score = 90;
		
		if(score>=0 & score<=100) {  
			if(score>=90) {
				System.out.println("A학점");
			}else if(score<90 & score>=80 ) {
				System.out.println("B학점");
			}else if(score<80 & score>=70 ) {
				System.out.println("C학점");
			}else if(score<70 & score>=60 ) {
				System.out.println("D학점");
		}
		}//내부  if문
		else {
			System.out.println("점수는 0이상 100이하 입니다");
		}
		
		System.out.println();
		
		//개인 작성
		
		  if(score>=90 & score<=100) { //90점 이산이지만 100 이하(100점 만점 기준)
			  	System.out.println("이름: " + name +"\t" + "학점: A "+ score+"점"); 
			  	
		  	}else if(score>=80 & score<90) { 
		  		System.out.println("이름: " + name +"\t" + "학점: B "+score +"점"); 
		  		
		  	}else if(score>=70 & score<80) { 
		  		System.out.println("이름: " +name +"\t" + "학점: C "+ score +"점"); 
		  		
		  	}else if(score>=60 & score<70) {
		  		System.out.println("이름: " + name +"\t" + "학점: D "+ score +"점"); 
		  		
		  	}else if(score>=0 & score<60){ 
		  		System.out.println("이름: " + name +"\t" + "학점: F "+ score +"점" +" (재시험)"); 
		  		
		  	}else { 
		  		System.out.println("잘못된 값입니다"); 
		  	}

		  System.out.println();
		
		//char이용
		  
		  
		 
		  if(score>=0 & score<=100) {  
			  if(score>=90) {
				result = "A"; grade = 'a';
			  }else if(score<90 & score>=80 ) {
				  result = "B"; grade = 'b';
			  }else if(score<80 & score>=70 ) {
				  result = "C"; grade = 'c';
			  }else if(score<70 & score>=60 ) {
				  result = "D"; grade = 'd';
			  }
		  }//내부  if문
		  else {
			  System.out.println("점수는 0이상 100이하 입니다");
		  }

		  
		  
	}		  	
}
		 
			

