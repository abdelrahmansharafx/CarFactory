class DiselEngine implements Engine {

    private int speed = 0;

    @Override
    public void increase() {
        speed++;
    }

    @Override
    public void decrease() {
        speed--;
    }

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public void notifySpeed(int currentSpeed) {
        // Diesel engine is notified of current speed
    }
}