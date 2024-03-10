package ch06ch07;

import java.util.Date;

//이 클래스는 Car01 클래스의 실행 클래스이다.
public class Car01_Main {

	public static void main(String[] args) {
		//Car01 클래스의 객체 생성 후 참조변수에 주소 저장
		//클래스명 참조변수 = new 클래스명();
	
/*		Car01 myCar = new Car01("Benz"); //Date 같은 경우 자리에 주소가 들어가야한다. 
		//알아서 해당 양식에 맞는 것을 찾아온다.
		System.out.println("myCar= " + myCar); //myCar= ch6.Car01@3b6eb2ec => 패키지명.클래스명@16진수 해시코드
*/
		
		//위의 코드를 다음과 같이 바꾸면 다른 것이 실행된다. 
		Car01 myCar = new Car01("고구마"); 
		System.out.println("myCar= " + myCar);
		//고구마 외에 가격이 1000이 호출되는 것은 
		//생성자에서 순차적으로 이루어지는 계산에 의해 자동적으로 호출되어 이를 주의하자 

		
		System.out.println("-------------------------------------------------------------");
		
		//String brand = myCar.brand; //전자의 brand는 변수명, 후자는 필드명 => 그러므로 중복된 이름이 가능하다.
		String brand = myCar.getBrand(); //필드명이 아닌 리턴 메소드를 통해 접근
		System.out.println("차량 브랜드: "+brand+"입니다.");
		
		String color = myCar.getColor();
		System.out.println("차량 색상: "+"초기값 "+color+"입니다.");
		//myCar.color = "silver"; //접근제한 때문에 이곳에서는 색상 변경 불가하다 
		
		int price = myCar.getPrice();
		System.out.println("차량 가격: "+price+"입니다.");
		
		double fuel = myCar.getFuel();
		System.out.println("차량 연비: "+fuel+"입니다.");
		
		char grade = myCar.getGrade();
		System.out.println("차량 등급: "+grade+"입니다.");
		
		boolean isAirBag = myCar.isAirBag();
		System.out.println("에어백이 장착된 차량입니까? "+isAirBag+"입니다.");
		
		Date mDate = myCar.getDate();
		System.out.println("차량의 제조일: "+mDate+"입니다.");
		
		//Car01 클래스의 color 필드 값 변경, 색상 변경
		//myCar.setColor(); //받을 값이 없기 때문에 (String color =) 불필요 
		//System.out.println("차량 색상: "+"변경값 "+myCar.getColor()+"입니다.");
		
		System.out.println("-------------------------------------------------------------");
		
		//setter이용한 입력값 출력
		
		//값을 입력하여 브랜드 변경
		myCar.setBrand("Benz"); //필드명이 아닌 리턴 메소드를 통해 접근
		System.out.println("차량 브랜드: "+myCar.getBrand()+"입니다.");
		
		//값을 입력하여 색상 변경
		myCar.setColor("Pearl Gray");
		System.out.println("차량 색상: "+"변경값 "+myCar.getColor()+"입니다.");
		
		myCar.setPrice(2000000);
		System.out.println("차량 가격: "+myCar.getPrice()+"입니다.");
		
		myCar.setFuel(4.5);
		System.out.println("차량 연비: "+myCar.getFuel()+"입니다.");
		
		myCar.setGrade('A');
		System.out.println("차량 등급: "+myCar.getGrade()+"입니다.");
		
		myCar.setIsAirBag(false);
		System.out.println("에어백이 장착된 차량입니까? "+myCar.isAirBag()+"입니다.");
		
		myCar.setMDate(mDate);
		System.out.println("차량의 제조일: "+myCar.getDate()+"입니다.");
		
		System.out.println("-------------------------------------------------------------");
		
		
	}

}
