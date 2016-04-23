package coffee.pump;

import coffee.Heater;

final class Thermosiphon implements Pump {
    private final Heater heater;

    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
