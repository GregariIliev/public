package greedyTimes;

public class Gold implements BagItem {

    private long total;
    private boolean assigned;

    public Gold() {
        this.total = 0L;
    }

    @Override
    public long getTotal() {
        return this.total;
    }

    @Override
    public void increase(String item, long quantity) {
        this.total += quantity;
        this.assigned = true;
    }

    @Override
    public boolean isAssigned() {
        return this.assigned;
    }

    @Override
    public String toString() {
        return String.format("<Gold> $%d%n", this.total) +
               String.format("##Gold - %d%n", this.total);
    }

}
