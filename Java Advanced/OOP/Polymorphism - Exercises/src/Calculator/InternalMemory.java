package calculator;

import java.util.ArrayDeque;

public class InternalMemory{
    private ArrayDeque<Integer> memory;

    public InternalMemory(){
        this.memory = new ArrayDeque<>();
    }

    public int popMemory() {
        return this.memory.pop();
    }

    public void addToMemory(int result) {
        this.memory.push(result);
    }
}