public class Engine {
    private int horsePw;
    private int maxSpeed;

    public Engine(int horsePw, int maxSpeed) {
        this.horsePw = horsePw;
        this.maxSpeed = maxSpeed;
    }

    public int getHorsePw() {
        return horsePw;
    }

    public void setHorsePw(int horsePw) {
        this.horsePw = horsePw;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return
                "horsePw = " + horsePw +
                "\nmaxSpeed = " + maxSpeed;
    }
}
