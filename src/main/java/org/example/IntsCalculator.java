package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        int newResult = (int) Math.round(formula.calculate(Calculator.Operation.SUM).result());
        return newResult;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        int newResult = (int) Math.round(formula.calculate(Calculator.Operation.MULT).result());
        return newResult;
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(a);
        formula.addOperand(b);
        int newResult = (int) Math.round(formula.calculate(Calculator.Operation.POW).result());
        return newResult;
    }
}
