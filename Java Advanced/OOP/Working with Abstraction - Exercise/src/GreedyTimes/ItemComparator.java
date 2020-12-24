package greedyTimes;

import java.util.Comparator;
import java.util.Map;

public class ItemComparator {

    private final Comparator<BagItem> comparator;

    public ItemComparator(Map<String, Integer> order) {
        this.comparator = (first, second) -> {
            int result = Long.compare(second.getTotal(), first.getTotal());

            if (result == 0 && order.size() > 1) {
                if (first instanceof CashContainer) {
                    if (second instanceof GemContainer)
                        result = Integer.compare(order.get("Cash"), order.get("Gem"));
                    else
                        result = Integer.compare(order.get("Cash"), order.get("Gold"));
                }
                else if (first instanceof GemContainer) {
                    if (second instanceof CashContainer)
                        result = Integer.compare(order.get("Gem"), order.get("Cash"));
                    else
                        result = Integer.compare(order.get("Gem"), order.get("Gold"));
                }
                else {
                    if (second instanceof CashContainer)
                        result = Integer.compare(order.get("Gold"), order.get("Cash"));
                    else
                        result = Integer.compare(order.get("Gold"), order.get("Gem"));
                }
            }

            return result;
        };
    }

    public Comparator<BagItem> getComparator() {
        return this.comparator;
    }

}
