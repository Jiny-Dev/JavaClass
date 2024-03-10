package ch06ch07;

//이 클래스는 DriverP346클래스의 실행클래스이다
public class DriverEx_p347 {

	public static void main(String[] args) {
		DriverP346 driver = new DriverP346();
		VehicleP347 vehicle = new VehicleP347();
		TaxiP348 taxi = new TaxiP348();
		BusP347 bus = new BusP347();
		
		//매개변수의 다형성을 사용한 경우
		driver.driveVehicle(vehicle);
		driver.driveVehicle(taxi);
		driver.driveVehicle(bus);
//		driver.driveBus(bus);
//		driver.driveTaxi(taxi);
	}

}
