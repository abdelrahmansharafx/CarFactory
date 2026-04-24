class Main {
	public static void main(String[] args) {
		Engine electricEngine = new ElectricEngine();
		Engine dieselEngine = new DiselEngine();
		HybridEngine hybridEngine = new HybridEngine();

		Car electricCar = new Car(electricEngine, "Electric Car");
		Car dieselCar = new Car(dieselEngine, "Diesel Car");
		Car hybridCar = new Car(hybridEngine, "Hybrid Car");

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
		System.out.println("Hybrid Car is using " + hybridEngine.currentEngine() + " engine.");
		hybridCar.accelerate();
		System.out.println("Hybrid speed: " + hybridCar.getSpeed());
		System.out.println("Hybrid Car is using " + hybridEngine.currentEngine() + " engine.");
		hybridCar.brake();
		System.out.println("Hybrid speed: " + hybridCar.getSpeed());
		System.out.println("Hybrid Car is using " + hybridEngine.currentEngine() + " engine.");
		hybridCar.stop();

		System.out.println("---------------------------------Replace Engine---------------------------------");
		electricCar.replaceEngine(new DiselEngine());
		electricCar.accelerate();
		System.out.println(electricCar.getSpeed());
	}
}
