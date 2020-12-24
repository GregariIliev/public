package greedyTimes;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CashContainer implements BagItem {

    Map<String, Long> cash;
    private long total;
    private boolean assigned;

    public CashContainer() {
        this.cash = new TreeMap<>(Collections.reverseOrder());
        this.total = 0L;
    }

    @Override
    public long getTotal() {
        return this.total;
    }

    @Override
    public void increase(String item, long quantity) {
        if (!cash.containsKey(item))
            cash.put(item, quantity);
        else
            cash.put(item, cash.get(item) + quantity);

        this.total += quantity;
        this.assigned = true;
    }

    @Override
    public boolean isAssigned() {
        return this.assigned;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(String.format("<Cash> $%d%n", this.total));

        for (Map.Entry<String, Long> entry : cash.entrySet())
            output.append(String.format("##%s - %d%n",
                    entry.getKey(), entry.getValue()));

        return output.toString();
    }

}
