package ch06ch07;

public class Car02 {
	//field -data
	//[접근제한자][제한자] 타입 필드명[=초기값];
	private int price;//가격
	private String color; //색상
	private double fuel; //연비
	
	//constructor - 필드 초기화  
	//[접근제한자] 클래스명(매개변수 리스트){}
	Car02(){
		this(0, null, 0.0); //다음과 같이 this로 다른 생성자를 불러오면 파라미터가 없는 생성자를 호출해도 값이 나온다.
		System.out.println();
		System.out.println("Car02(파라미터0개)호출\n"+"\n필드 price: "+this.price+"\n필드 color: "+this.color+"\n필드 fuel: "+this.fuel);
	}
	
	Car02(int price){
		this(price, null, 0.0); //price 매개변수는 있기 때문에 그대로 적지만 나머지는 아직 없으므로 초기값(값)을 추가한다.
		System.out.println();
		System.out.println("Car02(파라미터1개)호출\n"+"\n필드 price: "+this.price+"\n필드 color: "+this.color+"\n필드 fuel: "+this.fuel);
	}
	
	Car02(int price, String color){
		this(price, color, 0.0);
		System.out.println();
		System.out.println("Car02(파라미터2개)호출\n"+"\n필드 price: "+this.price+"\n필드 color: "+this.color+"\n필드 fuel: "+this.fuel);
	}
	
	Car02(int price, String color, double fuel){
		this.price = price;
		this.color = color;
		this.fuel = fuel;
		System.out.println("Car02(파라미터3개)호출\n"+"\n필드 price: "+this.price+"\n필드 color: "+this.color+"\n필드 fuel: "+this.fuel);
	}
	//this() 반드시 생성자 내 1번째 줄에 
	
	//method - 기능
	//[접근제한자][제한자] 리턴유형 메소드명(매개변수 리스트){}

}
