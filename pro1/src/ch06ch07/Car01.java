package ch06ch07;

import java.util.Date;

//이 클래스는 자동차 관련 정보, 기능을 제공하는 클래스이다.
//[access modifier] [modifier] class 클래스명{ }
public class Car01 {
	
//접근제한자 (access modifier) 	
	
	//field - data
	//문법 - 타입 필드명[=초기값]; => [access modifier][modifier] 타입 필드명 [=초기값];
/*	private String brand = "Mini"; //브랜드
	private String color = "Black" ; //색상
	private int price = 25000000; //가격
	private double fuel = 3.5; //연비
	private char grade = 'B'; //등급
	private boolean isAirBag = true; //에어백 장착 여부
	private Date mDate = new Date(); //제조일자
*/	
	private String brand; //브랜드
	private String color; //색상
	private int price;//가격
	private double fuel; //연비
	private char grade; //등급
	private boolean isAirBag; //에어백 장착 여부
	private Date mDate; //제조일자
	
//	----------------------------------------------------------------------------	
	
	//method - 기능
	//문법 - 리턴유형 메소드명( 매개변수 리스트){ } =>[access modifier][modifier] 리턴유형 메소드명( 매개변수 리스트){ } //매개 변수는 없을 수 있고 개수의 상관이 없다.
	
	//제한된 값을 리턴을 통해 제공하기
	//메소드명 유형=>show_brand 스네이크 케이스)(언더바로 구분). showBrand 카멜 케이스(대문자로 구분) 
	//get(ter) 메소드(메소드명은 용도에 따라 알맞게 작성한다) 
	
//getter & setter(p301)
	
	//getter
	String getBrand(){
		return brand;
	}
	
	String getColor(){
		return color;
	}
	
	
	int getPrice(){
		return price;
	}
	
	double getFuel(){
		return fuel;
	}
	
	char getGrade(){
		return grade;
	}
	
	boolean isAirBag(){
		return isAirBag;
	}
	
	Date getDate(){
		return mDate;
	}
	
//	----------------------------------------------------------------------------
	
	//setter
	void setBrand(String bran){             //입력하여 브랜드 변경
		brand = bran;
	}
	
	//void setColor(){             //void 리턴값 없음    //색상 변경
	//	color = "silver";
	//}
	
	void setColor(String col){             //입력하여 컬러 변경
		color = col;
	}
	
	void setPrice(int pri){      
		price = pri;
	}
	
	void setFuel(double fue){          
		fuel = fue;
	}
	
	void setGrade(char gra){            
		grade = gra;
	}
	
	void setIsAirBag(boolean isAB){        
		isAirBag = isAB;
	}
	
	void setMDate(Date mD){        
		mDate = mD;
	}

//	----------------------------------------------------------------------------	

/*
 this.
-객체(인스턴스) 자신의 참조(번지)를 가지고 있는 키워드
-객체 내부에서 인스턴스 멤버임을 명확히 하기 위해 this. 사용
-매개변수와 필드명이 동일할 때 
-인스턴스 필드임을 명확히 하기 위해 사용
 */
	
	//필드와 매개변수의 명이 같아 구별하지 못해 this. 을 사용하여 주소를 알려준다.
/*	void setBrand(String brand){             //입력하여 브랜드 변경
		//brand = brand;                                
		//필드와 매개변수의 이름이 같다(주소가 달라 문제는 없으나 앞의 brand가 필드임을 알 수 있도록 주소를 알려주어야 한다.)
		//참조변수 this.를 사용하여 알려준다.
		this.brand = brand;                                
	}
*/	
	
//	----------------------------------------------------------------------------	
	
	
	//constructor - 생성자, 객체 생성, 필드 초기화 //필드의 개수만큼 매개변수가 필요하다
	//클래스명 ( 매개변수 리스트){ } => [access modifier] 클래스명 ( 매개변수 리스트){ }
	//매개변수가 있는 생성자를 선언하면 기본 생성자는 자동으로 추가되지 않음을 주의
	Car01(){}//매개변수가 없는 기본 생성자
	//생성자는 클래스 이름이기 때문에 중복될 수 밖에 없다. 

	Car01(String brand){ 
		this("브랜드", 1000); //Constructor call must be the first statement in a constructor
											//생성자는 생성자 안에서 쓸 때, 맨 첫 줄이어야 한다.
		                                    //매개변수의 숫자, 타입, 순서가 같은 아래 생성자를 불러온다.
		this.brand = brand;
		//Car01("브랜드", 1000);//아래 생성자를 가져올 때, 메소드는 메소드를 호출할 수 잇으나 생성자가 생성자를 호출할 수 없음
	}
	
/*	 생성자의오버로딩 
	-동일 클래스 내에서는 동일한 이름의 생성자가 존재할 수 없다.	/*		Car01 myCar = new Car01("Benz"); //Date 같은 경우 자리에 주소가 들어가야한다. 
	//알아서 해당 양식에 맞는 것을 찾아온다.
	System.out.println("myCar= " + myCar); //myCar= ch6.Car01@3b6eb2ec => 패키지명.클래스명@16진수 해시코드
	-동일 클래스 내에서는 동일한 이름의 메서드가 존재할 수 없다.
	-단, 매개변수의 개수, 타입, 순서 중 하나라도 다르면 생성자를 여러개 선언이 가능하다.
*/
	Car01(String brand,  int price){ //다수의 매개변수가 들어갈 수 있기 때문에 매개변수 리스트라 부른다.
		this.brand = brand;
		this.price = price;
		}
	
	Car01(String brand, String color, int price, double fuel){ //다수의 매개변수가 들어갈 수 있기 때문에 매개변수 리스트라 부른다.
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.fuel = fuel;
	}
	
	Car01(String brand, String color, int price, double fuel, char grade, boolean isAirBag, Date mDate){ //다수의 매개변수가 들어갈 수 있기 때문에 매개변수 리스트라 부른다.
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.fuel = fuel;
		this.grade = grade;
		this.isAirBag = isAirBag;
		this.mDate = mDate;
	}

	
//overloading(오버로딩)
/*생성자 오버로딩(Overloading)(p238) 
-매개변수의 타입, 개수, 순서가 다른 생성자 여러 개 선언

*생성자 다양화해야 하는 이유
-객체 생성할 때 외부 값으로 객체를 초기화할 필요
-외부 값이 어떤 타입으로 몇 개가 제공될 지 모름 
  =>생성자도 다양화
*/
	
/*this() -p241
-생성자 오버로딩되면 생성자 간의 중복된 코드 발생
-초기화 내용이 비슷한 생성자들에서 이러한 현상을 많이 볼 수 있음
-초기화 내용을 한 생성자에 몰아 작성
-다른 생성자는 초기화 내용을 작성한 생성자를 this(…)로 호출
 */
	//중복값을 다른 것에서 가져와 줄일 수 있다.
	Car01(String brand, String color, int price){ 
		this(brand, color, price, 0.0, 'A', false, null);
	}


}


