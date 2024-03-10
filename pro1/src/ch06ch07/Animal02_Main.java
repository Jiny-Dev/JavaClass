package ch06ch07;

//이 클래스는 Animal02의 실행 클래스이다
public class Animal02_Main {
	//field
	//constructor
	//method
	public static void main(String[] args) {
	//[access modifier][modifier] 리턴유형 메소드명(argument list){}
		
		//Animal02의 객체
		Animal02 animal = new Animal02();
		System.out.println("animal참조변수= "+animal);
		System.out.println("animal.age= "+animal.age);
		System.out.println("animal.type= "+animal.type);
		System.out.println("---------------------");
		animal.eat();
		animal.move();
		animal.makeSound("동물");
		
		// anima1이라는 개념에 다양한 클래스를 넣어서 실행할 수 있다
		// 단, 변수를 넣은 후 바로 출력해야 덮어씌워지지 않는다
		Animal02 animal1 =  new Animal02();
		animal.makeSound(animal1); //animal1에서 Animal02를
		animal1 =  new Tiger();
		animal.makeSound(animal1); //animal1에서 Tiger를
		animal1 =  new Bird();
		animal.makeSound(animal1); //animal1에서 Bird를 가져온다
		//매개변수 자리에 참조변수가 하나인데 그안에 들어갈 수 있는 종류가 다양하고, 
		//다양한 클래스 내부에 상속관계에 있는 것들이 들어갈 수 있다. 
		
		//String str = new String("동물");
		String str = "동물"; //원래 위와 같이 표현하지만 String은 편의를 위해 생략 가능하다
		animal.makeSound(str);
		animal.makeSound(animal);
		animal.makeSound(animal);
		animal.makeSound(new Bird());//새로운 객체 생성으로 Bird 클래스를 넣음
		animal.makeSound(new Tiger());//새로운 객체 생성으로 Tiger 클래스를 넣음
		Bird birdobj = new Bird(); 
		animal.makeSound(birdobj);//새로운 객체 생성으로 Bird 클래스를 넣음
		Tiger tigerobj = new Tiger(); 
		animal.makeSound(tigerobj);//새로운 객체 생성으로 Bird 클래스를 넣음
		System.out.println("---------------------");
		
		Tiger tiger = new Tiger();
		System.out.println("tiger.age= "+tiger.age);
		System.out.println("tiger.type= "+tiger.type);
		System.out.println("---------------------");
		tiger.eat();
		tiger.move();
		String s = "어흥";
		tiger.makeSound(s);
		System.out.println("---------------------");
		
		//Bird 클래스의 객체
		Bird bird = new Bird();
		System.out.println("bird.age= "+bird.age);
		System.out.println("bird.type= "+bird.type);
		System.out.println("---------------------");
		//Bird 클래스의 기능
		bird.spawn();
		bird.eat();
		bird.move();
		bird.makeSound("짹짹짹짹");
	}
}
//public: 초록색 동그라미
//default: 파란색 삼각형
