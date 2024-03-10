package ch08_interface_abstractClass;

//이 클래스는 추상 클래스 AnimalP363의 하위 클래스를 사용하는 실행 클래스이다.
public class AnimalP363_Main {

	// 필드

	// 생성자

	// 메소드
	// static이 붙지 않은 메소드는 호출할 수 없다..
	public static void animalSound() {
		System.out.println("animalSound()야~");
	}

	public static void main(String[] args) {

		System.out.println("============");

//		 타입[] 배열참조변수 = new 타입[크기];
//		 클래스타입 참조변수 = new 클래스명();
//		 상위클래스 참조변수 = new 하위클래스();
//		 인터페이스 참조변수 = new 구현클래스();

		// 클래스타입 참조변수 = new 클래스명();
		Cat cat = new Cat();
		System.out.println(cat.kind);
		cat.breathe();
		cat.sound();

		System.out.println("----------------------");

		Dog dog = new Dog();
		System.out.println(dog.kind);
		dog.breathe();
		dog.sound();

		// 상위클래스 참조변수 = new 하위클래스();
//		AnimalP363 animal = new AnimalP363(); //추상클래스는 완성되지 않아 인스턴스를 생성할 수 없다.
		AnimalP363 animal = new Cat();
		animalSound(animal);

		System.out.println("----------------------");

		animalSound(cat);
		animalSound(dog);

		AnimalP363_Main obj = new AnimalP363_Main();
		System.out.println("----------------------");
	}

	public static void animalSound(AnimalP363 animal) {
		System.out.println("animalSound(Animal)야~");
		animal.sound();
	}

	public static void animalSound(Cat cat) {
		System.out.println("animalSound(Cat)야~");
	}

	public static void animalSound(Dog dog) {
		System.out.println("animalSound(Dog)야~");
	}
}
