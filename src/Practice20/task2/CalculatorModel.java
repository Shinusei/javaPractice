package Practice20.task2;

class CalculatorModel {
    private double currentValue;
    private double previousValue;
    private String currentOperation;

    public double getCurrentValue() {
        return currentValue;
    }

    public double getPreviousValue() {
        return previousValue;
    }

    public String getCurrentOperation() {
        return currentOperation;
    }

    public CalculatorModel() {
        currentValue = 0;
        previousValue = 0;
        currentOperation = "";
    }

    public void clear() {
        currentValue = 0;
        previousValue = 0;
        currentOperation = "";
    }

    public void setOperation(String operation) {
        if (currentOperation.isEmpty()) {
            previousValue = currentValue;
        }
        currentOperation = operation;
        currentValue = 0;
    }

    public void addDigit(double digit) {
        currentValue = currentValue * 10 + digit;
    }

    public double calculateResult() {
        switch (currentOperation) {
            case "+":
                return previousValue + currentValue;
            case "-":
                return previousValue - currentValue;
            case "*":
                return previousValue * currentValue;
            case "/":
                return previousValue / currentValue;
            default:
                return currentValue;
        }
    }
}