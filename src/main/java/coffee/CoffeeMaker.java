package coffee;

import com.memoizrlabs.Shank;

final class CoffeeMaker {

    private final Heater heater = Shank.provide(Heater.class);
    private final Pump pump = Shank.provide(Pump.class);

    public void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
