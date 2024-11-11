package edu.dnu.fpm.pz;

public class CalcImpl implements Calc {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double substraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        double tmp = 0;
        try {
            tmp = a / b;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return tmp;
    }
}
