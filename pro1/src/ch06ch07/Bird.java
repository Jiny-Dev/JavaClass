package ch06ch07;
//이 클래스는 Animal02클래스의 하위 클래스이다.
public class Bird extends Animal02 {

	//field
	String type = "조류";
	String sound = "새소리";
	
	//method
	void spawn() {
		System.out.println("알을 낳는다");
	}
	
	//먹는다
	@Override
	public void eat(){
		System.out.println("잡식이다");
	}
	//움직인다
	@Override
	void move(){
		System.out.println("날개로 움직인다");
	}
	//소리낸다
	@Override
	protected void makeSound(String sound){
		System.out.println("Bird= "+sound);
	}
	void sound(Bird obj){
		//obj. => Bird에서 정의한 것들을 호출할 수 있음
		System.out.println("Bird= "+obj);
	}
}
