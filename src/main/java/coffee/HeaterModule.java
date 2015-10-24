package coffee;

import com.memoizrlabs.Shank;
import com.memoizrlabs.ShankModule;

final class HeaterModule implements ShankModule {

    @Override
    public void registerFactories() {
        Shank.registerFactory(Heater.class, ElectricHeater::new);
    }
}
