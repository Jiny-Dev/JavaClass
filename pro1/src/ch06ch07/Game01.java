package ch06ch07;
/*
1~100임의 숫자 맞추기 game
player 2 - 나, 컴퓨터
높은 숫자를 제시한 사람이 이긴다.
정해진 게임 횟수동안 많이 이긴 쪽이 승리 
*/

/*static 키워드(p273) : 클래스 수준의 멤버로 선언.사용
=> 클래스명의 모든 인스턴스들이 공유하는 멤버
-클래스명.필드
-클래스명.필드=값
-클래스명.메서드명()
-클래스가 로딩될 때 메모리에 할당되며, 인스턴스 생성과는 독립적으로 동작
*실행순서 
-static 변수는 클래스가 로딩될 때 초기화
-정적 블록이나 변수 선언 시 직접 초기화.
-정적 블록은 코드에 나타나는 순서대로 실행

*인스턴스 멤버
-객체 수준에서 정의되며, 특정 인스턴스와 연결.
-객체가 생성될 때 메모리에 할당, 인스턴스 생성과 함께 초기화.
-각 인스턴스는 자체적인 인스턴스 멤버를 가지며, 인스턴스 간에 공유x.
-인스턴스 변수: 생성자를 통해 초기화
-인스턴스 메서드: 특정 인스턴스를 통해 호출되며, 해당 인스턴스에 대한 작업을 수행

*실행순서 
-인스턴스 변수가 메모리에 할당되고, 생성자를 통해 초기화
-생성자는 new 키워드를 사용하여 객체를 생성할 때 호출되며, 추가적인 초기화 작업을 수행
 클래스타입 참조변수명 = new 생성자명()*/

public class Game01 {

	//field
	static String gameName = "숫자 맞추기";
	int myScore = 0;
	int comScore = 0;
	
	//constructor
	
	
	//method
	//field-data
		//[접근제한자] [지시어] 타입 필드명[=초기화];

		
		//constructor-필드초기화
		//[접근제한자] 클래스명(매개변수리스트){}
		
		//method-기능.동작
		//[접근제한자] [지시어] 리턴타입 메서드명(매개변수리스트){}
		void run(){
			for(int i=1; i<=5; i++){
				//1~100임의 숫자
				int myNum = (int)(Math.random()*100)+1;
				int comNum= (int)(Math.random()*100)+1;

		   		if(myNum>comNum){ 
		   			myScore++; 
		   		}else if(myNum<comNum){ 
		   			comScore++;
		   		}
			}
		}

		//게임결과조회
		void displayGameResult(){
		   System.out.println("내 점수 : "+myScore);
		   System.out.println("컴퓨터 점수 :"+comScore);
		   if(myScore>comScore){ 
			   System.out.println("나의 win");
		   }else if(myScore<comScore){ 
			   System.out.println("컴 win");
		   }else {//내점수==컴점수라면  
			   System.out.println("비겼어요");
		   }	   
		}
		
	}//class

