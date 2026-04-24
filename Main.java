class Main {
	public static void main(String[] args) {
		Car electricCar = CarFactory.createCar("electric");
		Car dieselCar = CarFactory.createCar("diesel");
		Car hybridCar = CarFactory.createCar("hybrid");

		System.out.println("---------------------------------Electric Car--------------------------------");
		electricCar.start();
		electricCar.accelerate();
		electricCar.accelerate();
		System.out.println(electricCar.getSpeed());
		electricCar.brake();
		System.out.println(electricCar.getSpeed());
		electricCar.stop();

		System.out.println("---------------------------------Diesel Car---------------------------------");
		dieselCar.start();
		dieselCar.accelerate();
		dieselCar.accelerate();
		System.out.println(dieselCar.getSpeed());
		dieselCar.brake();
		System.out.println(dieselCar.getSpeed());
		dieselCar.stop();

		System.out.println("---------------------------------Hybrid Car---------------------------------");
		hybridCar.start();
		hybridCar.accelerate();
		hybridCar.accelerate();
		System.out.println("Hybrid speed: " + hybridCar.getSpeed());
		System.out.println("Hybrid Car is using " + hybridCar.currentEngine() + " engine.");
		hybridCar.accelerate();
		System.out.println("Hybrid speed: " + hybridCar.getSpeed());
		System.out.println("Hybrid Car is using " + hybridCar.currentEngine() + " engine.");
		hybridCar.brake();
		System.out.println("Hybrid speed: " + hybridCar.getSpeed());
		System.out.println("Hybrid Car is using " + hybridCar.currentEngine() + " engine.");
		hybridCar.stop();

		System.out.println("---------------------------------Replace Engine---------------------------------");
		CarFactory.replaceEngine(electricCar, "diesel");
		electricCar.accelerate();
		System.out.println(electricCar.getSpeed());
	}
}
