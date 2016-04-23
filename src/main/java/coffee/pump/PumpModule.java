package coffee.pump;

import com.memoizrlabs.ShankModule;

import coffee.Heater;

import static com.memoizrlabs.Shank.provideNew;
import static com.memoizrlabs.Shank.registerFactory;

public final class PumpModule implements ShankModule {
    @Override
    public void registerFactories() {
        registerFactory(Pump.class, () -> new Thermosiphon(provideNew(Heater.class)));
    }
}
