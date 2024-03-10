package ch06ch07;
//p256
//return 표현식; 예)return 값; return 연산식; return 메서드명;
//return; //줄 값이 없으니 그냥 종료하겠다.
public class Car04 {
	//field
	//[access modifier][modifier] 타입 필드면[=초기값];
	private int gas;
	
	//constructor
	//[access modifier] 클래스명(매개변수 리스트){}
	
	//method
	//[access modifier][modifier] 리턴유형 메소드명(매개변수 리스트){}
	
	//gas 필드 값 제공
	int getGas(){
		return this.gas;
	}
	//gas 필드 값 설정
	void setGas(int gas) {
		this.gas=gas;
	}
	//연료 잔량 상태 체크
	//return false: gas필드값 0/ true filed 값 > 0
	boolean isLeftGas(){
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false; //void가 아닌 경우 return은 꼭 있어야한다.
		}
		System.out.println("gas가 있습니다.");
		return true; //void가 아닌 경우 return은 꼭 있어야한다.
	}
	//운전하기
	void run() {
		while(true) {
			if(gas>0){
				System.out.println("움직입니다.\ngas 잔량"+getGas());
				gas-=1;//gas=gas-1; //--gas;
//				run(); //재귀호출: 자신을 호출하여 반복된다.
			}else {
				System.out.println("멈춥니다.\ngas 잔량"+getGas());
				//break; // 반복문 종료
				return; //메소드 종료
			}//if
		}//while
		//System.out.println("while 반복문 종료");//return에 의해 메소드가 끝나 실행되지 않음
	}//run()
}//class
