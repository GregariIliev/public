package greedyTimes;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class GemContainer implements BagItem {

    Map<String, Long> gems;
    private long total;
    private boolean assigned;

    public GemContainer() {
        this.gems = new TreeMap<>(Collections.reverseOrder());
        this.total = 0L;
    }

    @Override
    public long getTotal() {
        return this.total;
    }

    @Override
    public void increase(String item, long quantity) {
        if (!gems.containsKey(item))
            gems.put(item, quantity);
        else
            gems.put(item, gems.get(item) + quantity);

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

        output.append(String.format("<Gem> $%d%n", this.total));

        for (Map.Entry<String, Long> entry : gems.entrySet())
            output.append(String.format("##%s - %d%n",
                    entry.getKey(), entry.getValue()));

        return output.toString();
    }

}
