package ch06ch07;
//이 클래스는 Game 클래스의 실행 클래스
public class Game01_Main {

	public static void main(String[] args) {
		
		
		//Game 클래스 객체 생성
		Game01 game01 = new Game01();
		System.out.println(game01.gameName);
		//게임실행
		game01.run();
		//게임결과조회
		game01.displayGameResult();
		
		System.out.println("\n------------------------------\n");
		
		Game01 game02 = new Game01();
		System.out.println(game02.gameName);
		//게임실행
		game02.run();
		//게임결과조회
		game02.displayGameResult();
		
	}

}
