package ch08_interface_abstractClass;

//이 클래스는 AnimalP363 클래스의 하위 클래스이다
public class Cat extends AnimalP363 {

	@Override
	public void sound() { //추상 메소드는 반드시 @Override 해야한다.
		System.out.println("Cat-야옹");
	}

	public Cat() {
		this.kind = "고양이과";
	}
	
}
