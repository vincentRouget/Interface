public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.printf(getName() + " takes off in the sky.\n");
    }

    @Override
    public int ascend(int altitude) {
        System.out.printf(getName() + " flies upward, altitude: " + altitude + "\n");
        return this.altitude = altitude;
    }

    @Override
    public void glide() {
        System.out.printf("glides into the air.\n");
    }

    @Override
    public int descend(int altitude) {
        System.out.printf(getName() + " flies downward, altitude: " + altitude + "\n");
        return this.altitude = altitude;
    }

    @Override
    public void land() {
        if (this.altitude > 1) {
            System.out.printf(getName() + " is too high, it can't land.\n");

        } else {
            System.out.printf(getName() + " lands on the ground.\n");

        }
    }
}
