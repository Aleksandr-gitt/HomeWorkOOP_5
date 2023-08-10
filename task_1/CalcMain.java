package HomeWorkOOP_5.task_1;

public class CalcMain {
    public static void main(String[] args) {
        // Создание экземпляров модели, представления и презентера
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcPresent presenter = new CalcPresent(model, view);

        char userChoose = view.chooseOperation();
        switch (userChoose) {
            case '+':
                presenter.onAddButtonClicked();
                break;
            case '/':
                presenter.onDivButtonClicked();
                break;
            case '*':
                presenter.onMultButtonClicked();
                break;
            case '-':
                presenter.onSubtrackButtonClicked();
                break;
            default:
                System.out.println("Введена неверная операция!");
        }
        
        // Обработка действия пользователя (например, нажатие кнопки "Сложить")
        // presenter.onAddButtonClicked();
        // presenter.onDivButtonClicked();
        // presenter.onMultButtonClicked();
        // presenter.onSubtrackButtonClicked();
        
    }

}
