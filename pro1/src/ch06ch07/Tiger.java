package ch06ch07;
//이 클래스는 Animal02클래스의 하위 클래스이다.
public class Tiger extends Animal02 {
	
	//field
	String type = "포유류";
	String sound = "호랑이 소리";
	
	//method
	
	//먹는다j);//새로운 객체 생성으로 Bird 
	@Override
	public void eat(){
		System.out.println("육식이다");
	}
	//움직인다
	@Override
	void move(){
		System.out.println("다리로 움직인다");
	}
	//소리낸다
	@Override
	protected void makeSound(String sound){
		System.out.println("Tiger= "+sound);
	}
}
