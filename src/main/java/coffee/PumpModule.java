package coffee;

import com.memoizrlabs.Shank;
import com.memoizrlabs.ShankModule;

import static com.memoizrlabs.Shank.provideNew;

final class PumpModule implements ShankModule {

    @Override
    public void registerFactories() {
        final Heater heater = provideNew(Heater.class);

        Shank.registerFactory(Pump.class, () -> new Thermosiphon(heater));
    }
}
