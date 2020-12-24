import java.util.ArrayList;

public class StackOfStrings<String> {
    private ArrayList<java.lang.String> data;


    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(java.lang.String item) {
        this.data.add(item);
    }

    public java.lang.String pop() {
        return this.data.remove(0);
    }

    public java.lang.String peek() {
        return this.data.get(0);
    }

    public boolean isEmpty() {
        if (this.data.size() == 0) {
            return true;
        }
        return false;
    }

}
