class Car {

    private Engine engine;
    private int speed = 0;
    private String model;
    

    public Car(Engine engine, String model) {
        this.engine = engine;
        this.model = model;
    }

    public Car(Engine engine) {
        this.engine = engine;
        this.model = "";
    }

    public void start() {
        if (engine.speed() != 0) {
            System.out.println("Car is already running.");
            return;
        } 
        else {
        System.out.println(model + " is starting.");
        }
    }
    
    public void stop() {
        if (engine.speed() != 0) {
            System.out.println(model + " cannot stop until speed is 0.");
            return;
        }
        else {
        System.out.println(model + " is stopping.");
        }
    }
    // Accelerating will increase speed by 20 km/hr up to 200km/hr
    public void accelerate() {
        System.out.println(model + " is accelerating.");
        for (int i = 0; i < Math.min(20, 200 - engine.speed()); i++) {
            engine.increase();
        }
    }
    // Braking will decrease speed by 20 km/hr down to 0 km/hr
    public void brake() {
        System.out.println(model + " is braking.");
        for (int i = 0; i < Math.min(20, engine.speed()); i++) {
            engine.decrease();
        }
    }

    public int getSpeed() {
        speed = engine.speed();
        return engine.speed();
    }

    public void replaceEngine(Engine newEngine) {
        this.engine = newEngine;
        System.out.println("Engine replaced with " + newEngine.getClass().getSimpleName());
    }

    public void setEngine(Engine newEngine) {
        replaceEngine(newEngine);
    }
}