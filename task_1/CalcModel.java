package HomeWorkOOP_5.task_1;

public class CalcModel {

    private int result;

    public void add(int value1, int value2) {
        result = value1 + value2;
    }

    public void div(int value1, int value2){
        if(value2 != 0){
            result = value1/value2;
        }else{
            throw new IllegalArgumentException("Деление на ноль не допустимо!");        }
    }

    public void mult(int value1, int value2){
        result = value1*value2;
    }
    
    public void subtrack(int value1, int value2){
        result = value1-value2;
    }

    public int getResult() {
        return result;
    }

}
