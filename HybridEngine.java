class HybridEngine implements Engine {
    private ElectricEngine electricEngine;
    private DiselEngine diselEngine;
    private int speed = 0;

    public HybridEngine() {
        this.electricEngine = new ElectricEngine();
        this.diselEngine = new DiselEngine();
    }

    @Override
    public void increase() {
        speed++;
        synchronizeActiveEngine();
    }

    @Override
    public void decrease() {
        speed--;
        synchronizeActiveEngine();
    }

    @Override
    public int speed() {
        return speed;
    }

    public String currentEngine() {
        if (speed <= 50) {
            return "electric";
        }
        return "diesel";
    }

    @Override
    public void notifySpeed(int currentSpeed) {
        // Hybrid engine is notified of current speed
    }

    private void synchronizeActiveEngine() {
        if (speed <= 50) {
            while (electricEngine.speed() < speed) {
                electricEngine.increase();
            }
            while (electricEngine.speed() > speed) {
                electricEngine.decrease();
            }
        } else {
            while (diselEngine.speed() < speed) {
                diselEngine.increase();
            }
            while (diselEngine.speed() > speed) {
                diselEngine.decrease();
            }
        }
    }
}