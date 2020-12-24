package greedyTimes;

public interface BagItem {

    void increase(String item, long quantity);
    long getTotal();
    boolean isAssigned();

}
