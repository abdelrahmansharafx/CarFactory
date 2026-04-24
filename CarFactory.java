class CarFactory {
    public static Car createCar(Engine engine) {
        return new Car(engine);
    }

    public static void replaceEngine(Car car, Engine newEngine) {
        car.setEngine(newEngine);
    }
}