package HomeWorkOOP_5.task_1;

public class CalcPresent {

    private CalcModel model;
    private CalcView view;

    public CalcPresent(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.add(number1, number2);
        int result = model.getResult();

        view.displayResult(result);

    }

    public void onDivButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.div(number1, number2);
        int result = model.getResult();

        view.displayResult(result);

    }

    public void onMultButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.mult(number1, number2);
        int result = model.getResult();

        view.displayResult(result);

    }

    public void onSubtrackButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();

        model.subtrack(number1, number2);
        int result = model.getResult();

        view.displayResult(result);

    }

}
