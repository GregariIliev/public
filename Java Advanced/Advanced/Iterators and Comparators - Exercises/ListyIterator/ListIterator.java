import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListIterator<String> {

    private ArrayList<String> list;
    private int index = 0;

    public ListIterator(String... strings) {
        this.list = new ArrayList<>(Arrays.asList(strings));
    }

    public boolean hasNext() {
        if (this.index < this.list.size() - 1) {
            return true;
        }
        return false;
    }

    public boolean move() {
        if (hasNext()){
            this.index++;
            return true;
        }
        return false;
    }

    public void print() {
        if (this.list.size() == 0){
            System.out.println("Invalid Operation!");
        }else {
            System.out.println(this.list.get(this.index));
        }
    }
}
