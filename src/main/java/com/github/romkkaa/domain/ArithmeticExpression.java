package com.github.romkkaa.domain;

public class ArithmeticExpression {

    private Long firstNumber;
    private Long secondNumber;
    private Operation operation;

    public ArithmeticExpression(String firstNumber, String secondNumber, String operator) {
        try {
            this.firstNumber = Long.parseLong(firstNumber);
            this.secondNumber = Long.parseLong(secondNumber);
            this.operation = Operation.getBySign(operator);
        } catch (NumberFormatException e) {
            throw new RuntimeException(
                    String.format("'%s %s %s' is not a valid arithmetic expression", firstNumber, operator, secondNumber)
            );
        }
    }

    public Long getFirstNumber() {
        return firstNumber;
    }

    public Long getSecondNumber() {
        return secondNumber;
    }

    public Operation getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", firstNumber, operation.getSign(), secondNumber);
    }

}
