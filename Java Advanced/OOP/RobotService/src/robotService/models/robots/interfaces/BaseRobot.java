package robotService.models.robots.interfaces;

import static robotService.common.ExceptionMessages.INVALID_ENERGY;
import static robotService.common.ExceptionMessages.INVALID_HAPPINESS;

public abstract class BaseRobot implements Robot {
    private String name;
    private int happiness;
    private int energy;
    private int procedureTime;
    private String owner;
    private boolean isBought;
    private boolean isRepaired;

    protected BaseRobot(String name, int energy, int happiness, int procedureTime){
        setName(name);
        setHappiness(happiness);
        setEnergy(energy);
        setProcedureTime(procedureTime);

    }

    private void setName(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getHappiness() {
        return 0;
    }

    @Override
    public void setHappiness(int happiness) {
        if (happiness < 0 || happiness > 100){
            throw new IllegalArgumentException(INVALID_HAPPINESS);
        }
        this.happiness = happiness;
    }

    @Override
    public int getEnergy() {
        return 0;
    }

    @Override
    public void setEnergy(int energy) {
        if (energy < 0 || energy > 100){
            throw new IllegalArgumentException(INVALID_ENERGY);
        }
        this.energy = energy;
    }

    @Override
    public int getProcedureTime() {
        return 0;
    }

    @Override
    public void setProcedureTime(int procedureTime) {
        this.procedureTime = procedureTime;
    }

    @Override
    public void setOwner(String owner) {

    }

    @Override
    public void setBought(boolean bought) {

    }

    @Override
    public boolean isRepaired() {
        return false;
    }

    @Override
    public void setRepaired(boolean repaired) {

    }
}
