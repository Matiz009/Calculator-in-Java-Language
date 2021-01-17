
public class calculator {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public static double add(int number1,int number2){
        return number1+number2;
    }
    static double subtract(int number1,int number2){
        return number1-number2;
    }
    static double product(int number1,int number2){
        return number1*number2;
    }
    static double division(int number1,int number2){
        return number1/number2;
    }
}
