class CarFactory {
    public static Car createCar(String engineType) {
        Engine engine;
        if (engineType.equalsIgnoreCase("electric")) {
            engine = new ElectricEngine();
        } else if (engineType.equalsIgnoreCase("diesel")) {
            engine = new DiselEngine();
        } else if (engineType.equalsIgnoreCase("hybrid")) {
            engine = new HybridEngine();
        } else {
            engine = new ElectricEngine();
        }
        return new Car(engine);
    }

    public static void replaceEngine(Car car, String engineType) {
        Engine engine;
        if (engineType.equalsIgnoreCase("electric")) {
            engine = new ElectricEngine();
        } else if (engineType.equalsIgnoreCase("diesel")) {
            engine = new DiselEngine();
        } else if (engineType.equalsIgnoreCase("hybrid")) {
            engine = new HybridEngine();
        } else {
            engine = new ElectricEngine();
        }
        car.setEngine(engine);
    }
}