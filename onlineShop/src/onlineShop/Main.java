package onlineShop;

import onlineShop.core.EngineImpl;
import onlineShop.core.interfaces.Engine;
import onlineShop.models.products.Component;
import onlineShop.models.products.components.BaseComponent;
import onlineShop.models.products.computers.BaseComputer;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
