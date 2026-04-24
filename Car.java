class Car {

    private Engine engine;
    protected int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    private String getCarName() {
        String engineName = engine.getClass().getSimpleName();
        if (engineName.endsWith("Engine")) {
            engineName = engineName.substring(0, engineName.length() - 6);
        }
        return engineName + " Car";
    }

    public void start() {
        if (engine.speed() != 0) {
            System.out.println("Car is already running.");
            return;
        } else {
            System.out.println(getCarName() + " is starting.");
        }
    }
    
    public void stop() {
        if (engine.speed() == 0) {
            System.out.println("Car is not running.");
            return;
        } else {
            System.out.println(getCarName() + " is stopping.");
        }
    }
    // Accelerating will increase speed by 20 km/hr up to 200km/hr
    public void accelerate() {
        System.out.println(getCarName() + " is accelerating.");
        for (int i = 0; i < Math.min(20, 200 - engine.speed()); i++) {
            engine.increase();
        }
        engine.notifySpeed(engine.speed());
    }
    // Braking will decrease speed by 20 km/hr down to 0 km/hr
    public void brake() {
        System.out.println(getCarName() + " is braking.");
        for (int i = 0; i < Math.min(20, engine.speed()); i++) {
            engine.decrease();
        }
        engine.notifySpeed(engine.speed());
    }

    public int getSpeed() {
        return engine.speed();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine newEngine) {
        this.engine = newEngine;
    }

    public String currentEngine() {
        if (engine instanceof HybridEngine) {
            return ((HybridEngine) engine).currentEngine();
        }
        return "engine";
    }
}