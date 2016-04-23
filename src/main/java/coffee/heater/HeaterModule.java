package coffee.heater;

import com.memoizrlabs.ShankModule;

import coffee.Heater;

import static com.memoizrlabs.Shank.registerFactory;

public final class HeaterModule implements ShankModule {
    @Override
    public void registerFactories() {
        registerFactory(Heater.class, ElectricHeater::new);
    }
}
