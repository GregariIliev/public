package calculator;

public class CalculationEngine {
    private int result;
    private Operation currentOperation;
    private InternalMemory memory;

    public CalculationEngine() {
        this.result = 0;
        this.currentOperation = null;
        this.memory = new InternalMemory();
    }

    public void pushNumber(int number) {
        if (this.currentOperation != null) {
            currentOperation.addOperand(number);

            if (currentOperation.isCompleted()) {
                this.result = currentOperation.getResult();
                this.currentOperation = null;
            }
        } else {
            this.result = number;
        }
    }

    public InternalMemory getInternalMemory() {
        return this.memory;
    }

    void pushOperation(Operation operation) {
        if(operation == null){
            return;
        }
        if (operation.isCompleted()) {
            this.pushNumber(operation.getResult());

        } else {
            this.currentOperation = operation;
            this.pushNumber(this.result);
        }
    }

    int getCurrentResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
