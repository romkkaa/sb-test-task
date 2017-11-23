package com.github.romkkaa.domain;

public class ArithmeticStatement {

    private Long firstNumber;
    private Long secondNumber;
    private Operation operation;
    private Double result;

    public ArithmeticStatement(String statement) {
        String[] array = statement.split(";");
        if (array.length != 4) {
            throw new RuntimeException(String.format("'%s' is not a valid arithmetic statement", statement));
        }
        firstNumber = Long.parseLong(array[0]);
        secondNumber = Long.parseLong(array[1]);
        operation = Operation.getBySign(array[2]);
        result = Double.parseDouble(array[3]);
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

}
