import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2;
        int loopTrue = 1;
        String sign;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the console calculator!");

        while(loopTrue==1) {

            System.out.println("Please enter a number: ");
            num1 = in.nextDouble();

            System.out.println("Please enter another number: ");
            num2 = in.nextDouble();

            System.out.println("Please enter the sign for the operation | + - * / ");
            sign = System.console().readLine();

            Calculator ourCalc = new Calculator(num1, num2, sign);
            double result = ourCalc.calculate();
            System.out.println("result: " + result);

            System.out.println("If you want to continue, type 1, otherwise, type 0");
            loopTrue = in.nextInt();
        }

        System.out.println("Thanks for playing!");
    }
}