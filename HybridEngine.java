class HybridEngine implements Engine {
    private ElectricEngine electricEngine = new ElectricEngine();
    private DiselEngine diselEngine = new DiselEngine();
    private int speed = 0;

    @Override
    public void increase() {
        speed++;
        if (speed < 50) {
            electricEngine.increase();
        } else {
            diselEngine.increase();
        }
        
    }

    @Override
    public void decrease() {
        speed--;
        if (speed < 50) {
            electricEngine.decrease();
        } else {
            diselEngine.decrease();
        }
    }

    @Override
    public int speed() {
        return speed;
    }

    public String currentEngine() {
        if (speed < 50) {
            return "electric";
        }
        return "diesel";
    }
}