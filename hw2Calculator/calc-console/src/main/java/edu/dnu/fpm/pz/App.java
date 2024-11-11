package edu.dnu.fpm.pz;

public class App {

    public static void main(String[] args) {
        if (args.length < 3)  {
            System.err.println("Not enought parameters!");
            return;
        }

        Calc calc = new CalcImpl();
        double a;

        try {
            a = Double.parseDouble(args[0]);
        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }

        double b;
        try {
            b = Double.parseDouble(args[1]);
        }
        catch (Exception e) {
            System.err.println("Invalid second argument!");
            return;
        }

        double result = 0;
        switch (args[2]) {
            case "+":
                result = calc.addition(a, b);
                break;
            case "-":
                result = calc.substraction(a, b);
                break;
            case "*":
                result = calc.multiplication(a, b);
                break;
            case "/":
                result = calc.division(a, b);
                break;
            default: {
                System.err.println("Invalid operator!");
                return;
            }
        }
        System.out.println("number1= " + a + " number2= " + b + " operator= " + args[2]+ " result= " + result);
    }

}
