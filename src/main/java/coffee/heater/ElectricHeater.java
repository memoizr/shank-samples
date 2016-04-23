package coffee.heater;

import coffee.Heater;

final class ElectricHeater implements Heater {
    private boolean isHeating;

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
