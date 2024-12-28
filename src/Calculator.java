public class Calculator{

    private String sign;
    private double num1, num2;

    public Calculator(double num1, double num2, String sign) {
        this.num2 = num2;
        this.num1 = num1;
        this.sign = sign;
    }

    public double sum(){
        return num1+num2;
    }

    public double subtract(){
        return num1-num2;
    }

    public double divide() { return num1/num2;}

    public double multiply(){ return num1*num2;}

    public double calculate(){

        switch(sign){
            case "+": return sum();
            case "-": return subtract();
            case "/": return divide();
            case "*": return multiply();
            default:System.out.println("Please enter a valid sign");
        }

        return 0;
    }
}