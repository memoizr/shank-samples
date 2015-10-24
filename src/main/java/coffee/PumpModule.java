package coffee;

import com.memoizrlabs.Shank;
import com.memoizrlabs.ShankModule;

final class PumpModule implements ShankModule {

    @Override
    public void registerFactories() {
        final Heater heater = Shank.provide(Heater.class);

        Shank.registerFactory(Pump.class, () -> new Thermosiphon(heater));
    }
}
