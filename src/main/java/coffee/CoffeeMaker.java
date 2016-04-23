package coffee;

import coffee.pump.Pump;

import static com.memoizrlabs.Shank.provideNew;

final class CoffeeMaker {
    private final Heater heater = provideNew(Heater.class);
    private final Pump pump = provideNew(Pump.class);

    void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
