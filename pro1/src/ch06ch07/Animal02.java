package ch06ch07;

//이 클래스는 Tiger와 Bird의 상위 클래스이다.
public class Animal02 {
	
	//field
	//나이
	int age;
	//타입
	String type;
	String sound = "동물소리";
	
	//method
	//먹는다
	void eat(){
		System.out.println("Animal02-eat()");
	}
	//움직인다
	void move(){
		System.out.println("Animal02-move()");
	}
	//소리낸다
	void makeSound(String sound){ //시그니처가 같지 않아 오류가 난다 => Tiger와 Bird에서 같은 타입으로 바꿔주자
		System.out.println("Animal02-makeSound()");
	}
	void makeSound(Animal02 obj){
		//이름이 같으려면 매개변수의 개수, 타입, 변수명이 달라야 한다
		//String이라는 클래스도 들어가기 때문에, 직접 정의한 클래스도 넣을 수 있다.
		System.out.println("매개가 되면서 주소가 참조되는 참조변수 obj= "+obj);
	}
//	void makeSound(Animal02 animal){
//		System.out.println("매개가 되면서 주소가 참조되는 참조변수 animal= "+animal);
//	}	
	void makeSound(Bird bird){
		System.out.println("매개가 되면서 주소가 참조되는 참조변수 bird= "+bird);
	}	
	void makeSound(Tiger tiger){
		System.out.println("매개가 되면서 주소가 참조되는 참조변수 tiger= "+tiger);
	}	
}
