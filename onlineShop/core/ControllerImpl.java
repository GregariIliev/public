package onlineShop.core;

import onlineShop.common.constants.ExceptionMessages;
import onlineShop.core.interfaces.Controller;
import onlineShop.models.products.Component;
import onlineShop.models.products.Computer;
import onlineShop.models.products.Peripheral;
import onlineShop.models.products.computers.DesktopComputer;

import java.util.ArrayList;
import java.util.List;

public class ControllerImpl implements Controller {
    private List<Computer> computerList = new ArrayList<>();
    private List<Component> componentList = new ArrayList<>();
    private List<Peripheral> peripheralList = new ArrayList<>();

    @Override
    public String addComputer(String computerType, int id, String manufacturer, String model, double price) {
        String exceptionMessage = "";

        Computer computer = addDesktopComputer(computerType, id, manufacturer, model, price);
        checkExistComputerInList(computer);

        return exceptionMessage;
    }

    private Computer addDesktopComputer(String computerType, int id, String manufacturer, String model, double price) {
        Computer computer = null;
        if (computerType.equals("DesktopComputer")){
            computer = new DesktopComputer(id, manufacturer, model, price);
        }
        return computer;
    }

    @Override
    public String addPeripheral(int computerId, int id, String peripheralType, String manufacturer, String model, double price, double overallPerformance, String connectionType) {
        return null;
    }

    @Override
    public String removePeripheral(String peripheralType, int computerId) {
        return null;
    }

    @Override
    public String addComponent(int computerId, int id, String componentType, String manufacturer, String model, double price, double overallPerformance, int generation) {

        return null;
    }

    @Override
    public String removeComponent(String componentType, int computerId) {
        return null;
    }

    @Override
    public String buyComputer(int id) {
        return null;
    }

    @Override
    public String BuyBestComputer(double budget) {
        return null;
    }

    @Override
    public String getComputerData(int id) {
        return null;
    }

    private boolean checkExistComputerInList(Computer computer) {
        boolean exist = false;

        for (Computer computer1 : computerList) {
            if (computer.getId() == computer1.getId()){
                exist = true;
                throw new IllegalArgumentException(ExceptionMessages.EXISTING_COMPUTER_ID);
            }
        }
        return false;
    }
}
