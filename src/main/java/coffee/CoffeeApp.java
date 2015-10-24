package coffee;

import com.memoizrlabs.ShankModuleInitializer;

public final class CoffeeApp implements Runnable {

    static {
        ShankModuleInitializer.initializeModules(
                new HeaterModule(),
                new PumpModule()
        );
    }

    private final CoffeeMaker coffeeMaker = new CoffeeMaker();

    @Override public void run() {
        coffeeMaker.brew();
    }

    public static void main(String[] args) {
        final CoffeeApp coffeeApp = new CoffeeApp();
        coffeeApp.run();
    }
}
