package coffee;

import com.memoizrlabs.ShankModuleInitializer;

public final class CoffeeApp {
    public static void main(String[] args) {
        // Initialize modules before using!
        ShankModuleInitializer.initializeModules(new HeaterModule(), new PumpModule());
        new CoffeeMaker().brew();
    }
}
