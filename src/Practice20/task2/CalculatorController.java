package Practice20.task2;

// Контроллер (Controller)
class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        view.setController(this);
    }

    public void numberPressed(int number) {
        model.addDigit(number);
        view.setDisplay(model.getCurrentValue());
    }

    public void operationPressed(String operation) {
        model.setOperation(operation);
        view.setDisplay(model.getCurrentValue());
    }

    public void clear() {
        model.clear();
        view.setDisplay(model.getCurrentValue());
    }

    public void calculateResult() {
        double result = model.calculateResult();
        model.clear();
        model.addDigit(result);
        view.setDisplay(result);
    }
}
