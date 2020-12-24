package greedyTimes;

import java.util.*;

public class Bag {

    private final long capacity;
    private long currentSize;
    private final BagItem cashContainer;
    private final BagItem gemContainer;
    private final BagItem gold;
    private final Map<String, Integer> order;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.currentSize = 0L;
        this.cashContainer = new CashContainer();
        this.gemContainer = new GemContainer();
        this.gold = new Gold();
        this.order = new HashMap<>();
    }

    public boolean checkSize(long newQuantity) {
        return this.currentSize + newQuantity > this.capacity;
    }

    public void addCash(String item, long quantity) {
        if (this.cashContainer.getTotal() + quantity <= this.gemContainer.getTotal()) {
            this.cashContainer.increase(item, quantity);
            this.currentSize += quantity;
            this.order.putIfAbsent("Cash", this.order.size());
        }
    }

    public void addGems(String item, long quantity) {
        if (this.gemContainer.getTotal() + quantity <= this.gold.getTotal()) {
            this.gemContainer.increase(item, quantity);
            this.currentSize += quantity;
            this.order.putIfAbsent("Gem", this.order.size());
        }
    }

    public void addGold(long quantity) {
        this.gold.increase("", quantity);
        this.currentSize += quantity;
        this.order.putIfAbsent("Gold", this.order.size());
    }

    public Set<BagItem> getContent() {
        ItemComparator itemComparator = new ItemComparator(this.order);

        Set<BagItem> bagItems = new TreeSet<>(itemComparator.getComparator());

        if (this.cashContainer.isAssigned())
            bagItems.add(this.cashContainer);
        if (this.gemContainer.isAssigned())
            bagItems.add(this.gemContainer);
        if (this.gold.isAssigned())
            bagItems.add(this.gold);

        return bagItems;
    }

}
