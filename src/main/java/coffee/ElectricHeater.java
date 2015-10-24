package coffee;

final class ElectricHeater implements Heater {

    boolean isHeating;

    @Override public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.isHeating = true;
    }

    @Override
    public void off() {
        this.isHeating = false;
    }

    @Override
    public boolean isHot() {
        return isHeating;
    }
}
