class CarFactory {
    public static Car createCar(String engineType) {
        Engine engine = createEngine(engineType);
        if (engine == null) {
            engine = new ElectricEngine();
        }
        return new Car(engine);
    }

    public static void replaceEngine(Car car, String engineType) {
        Engine engine = createEngine(engineType);
        if (engine == null) {
            System.out.println("Invalid engine type. No replacement made.");
            return;
        }
        car.setEngine(engine);
    }

    private static Engine createEngine(String engineType) {
        if (engineType.equalsIgnoreCase("electric")) {
            return new ElectricEngine();
        }
        if (engineType.equalsIgnoreCase("diesel")) {
            return new DiselEngine();
        }
        if (engineType.equalsIgnoreCase("hybrid")) {
            return new HybridEngine();
        }
        return null;
    }
}