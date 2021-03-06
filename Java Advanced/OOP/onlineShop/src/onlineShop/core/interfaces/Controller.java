package onlineShop.core.interfaces;

import java.lang.reflect.InvocationTargetException;

public interface Controller {
    String addComputer(String computerType, int id, String manufacturer, String model, double price) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

    String addPeripheral(int computerId, int id, String peripheralType, String manufacturer, String model, double price, double overallPerformance, String connectionType);

    String removePeripheral(String peripheralType, int computerId);

    String addComponent(int computerId, int id, String componentType, String manufacturer, String model, double price, double overallPerformance, int generation) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;

    String removeComponent(String componentType, int computerId);

    String buyComputer(int id);

    String BuyBestComputer(double budget);

    String getComputerData(int id);
}
