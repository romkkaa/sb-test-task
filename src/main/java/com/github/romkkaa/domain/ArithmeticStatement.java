package com.github.romkkaa.domain;

public class ArithmeticStatement {

    private Long firstNumber;
    private Long secondNumber;
    private Operation operation;
    private Double result;

    public ArithmeticStatement(String firstNumber, String secondNumber, String operator, String result) {
        try {
            this.firstNumber = Long.parseLong(firstNumber);
            this.secondNumber = Long.parseLong(secondNumber);
            this.operation = Operation.getBySign(operator);
            this.result = Double.parseDouble(result);
        } catch (NumberFormatException e) {
            throw new RuntimeException(
                    String.format("'%s;%s;%s;%s' is not a valid arithmetic statement", firstNumber, secondNumber, operator, result)
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

    public Double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s = %s", firstNumber, operation.getSign(), secondNumber, result);
    }

}
