package CounterStriker;

import CounterStriker.core.EngineImpl;
import CounterStriker.core.Engine;
import CounterStriker.models.guns.Gun;
import CounterStriker.models.players.Player;
import CounterStriker.repositories.GunRepository;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();

    }
}
