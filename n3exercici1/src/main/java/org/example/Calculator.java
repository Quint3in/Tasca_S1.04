package org.example;

public class Calculator {
    private double total;

    public Calculator(){
        total = 0;
    }

    public double getTotal() {
        return total;
    }

    public void sum(double x){
        total+=x;
    }
    public void sub(double x){
        total-=x;
    }
    public void mul(double x){
        total*=x;
    }
    public void div(double x){
        if (x!=0) {
            total/=x;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
    public void reset() {
        total = 0;
    }
}
