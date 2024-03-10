package ch06ch07;
/*
메소드란?(p251)
-객체의 동작(기능)
-호출해서 실행할 수 있는 중괄호 { } 블록
-메소드 호출하면 중괄호 { } 블록에 있는 모든 코드들이 일괄 실행
 
method 4가지
1)매개변수 없고 리턴값 없는 메소드
	void 메소드명(){
	}
2)매개변수 없고 리턴값 있는 메소드
	void 메소드명(){
		return 값;
	}
3)매개변수 있고 리턴값 없는 메소드
	void 메소드명(매개변수 리스트){
	}
4)매개변수 있고 리턴값 있는 메소드
	void 메소드명(매개변수 리스트){
		return 값;
	}
*/
public class Car03 {
	
	//field - 속성.data
	//[access modifier] [modifier] 타입 필드명[=초기값];
	String brand = "benz"; //브랜드
	int price = 7050;//가격
	int speed = 0;//현재속도
	int maxSpeed = 300;//최대속도

//--------------------------------------------------------------------------------------------
			
	//constructor - 생성자
	//[access modifier] 클래스명(매개변수리스트){ }

//--------------------------------------------------------------------------------------------
	
	//method - 기능
	//[access modifier] [modifier] 타입 메소드명(매개변수리스트) {}
	
	//시동을 걸다
	void powerOn(){
		System.out.println("powerOn()-시동합니다.");
	}
	//시동을 끄다
	void powerOff(){
		System.out.println("powerOff()-시동끕니다.");
	}
	//현재 속도 조회
	int showCurrSpeed() {
		System.out.println("현재속도는 "+this.speed+"km/h입니다.");
		return this.speed;
	}
	
	//가속하다
	int speedUp(){
		return ++speed;
	}
	//감속하다
	int speedDown(){
		speed = speed -1;
		return speed;
	}
	
	//감속 + 현재 속도 조회
	int speedDown2(){
		speed = speed -1;
		showCurrSpeed();//메소드내에서 또 다른 메소드 호출
		return speed; 
		//return은 종료를 의미하므로, return은 함수} 직전 사용한다.
		//뒤에 코드 문장이 올 수 없다.
	}
		
	//방향 전환
	void changeDir(String direction){
		System.out.println(direction+"방향으로 전환");
	}
		
	void changeDir(char direction){ //위와 명이 같지만 오버로딩을 통해 가능
		System.out.println(direction+"방향으로 전환");
	}
	
//	void changeDir(int angle){ //위와 명이 같지만 오버로딩을 통해 가능
//		System.out.println(angle+"° 방향으로 전환");
//	}
	
	//1:전진, 2:후진, 3:왼쪽, 4:오른쪽
	String changeDir2(int direction){ //위와 명이 같지만 오버로딩을 통해 가능
		String result = null;
		switch(direction) {
		case 1: result= "전진";
		case 2: result= "후진";
		case 3: result= "왼쪽";
		case 4: result= "오른쪽";
		default: result= " 무";
		}
		
		return result = "방향으로 전환";
	}
	
}
