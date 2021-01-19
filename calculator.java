public class Calculator {
    private double number1;
    private double number2;


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public static double add(double number1, double number2){
        return number1+number2;
    }
    static double subtract(double number1,double number2){
        return number1-number2;
    }
    static double product(double number1,double number2){
        return number1*number2;
    }
    static double division(double number1,double number2){
        return number1/number2;
    }
}
