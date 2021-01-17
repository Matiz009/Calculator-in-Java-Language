import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        calculator calculate=new calculator();
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.println("Press 4 to divide numbers");
        System.out.println("Press 0 to exit");
        int dec= scanner.nextInt();
        switch (dec){
            case 1->{
                System.out.println("Enter first number");
                calculate.setNumber1(scanner.nextInt());
                System.out.println("Enter second number");
                calculate.setNumber2(scanner.nextInt());
                System.out.println("Sum of numbers : "+calculator.add(calculate.getNumber1(),calculate.getNumber2()));
            }
            case 2->{
                System.out.println("Enter first number");
                calculate.setNumber1(scanner.nextInt());
                System.out.println("Enter second number");
                calculate.setNumber2(scanner.nextInt());
                System.out.println("Subtraction of numbers : "+calculator.subtract(calculate.getNumber1(),calculate.getNumber2()));
            }
            case 3->{
                System.out.println("Enter first number");
                calculate.setNumber1(scanner.nextInt());
                System.out.println("Enter second number");
                calculate.setNumber2(scanner.nextInt());
                System.out.println("Product of numbers : "+calculator.product(calculate.getNumber1(),calculate.getNumber2()));
            }
            case 4->{
                System.out.println("Enter first number");
                calculate.setNumber1(scanner.nextInt());
                System.out.println("Enter second number");
                calculate.setNumber2(scanner.nextInt());
                System.out.println("Division of numbers is : "+calculator.division(calculate.getNumber1(),calculate.getNumber2()));

            }
            default -> System.exit(0);


        }
    }
}
