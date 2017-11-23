package com.github.romkkaa.domain;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operation {

    PLUS(
            "+",
            (a, b) ->  a.doubleValue() + b.doubleValue()
    ),

    MINUS(
            "-",
            (a, b) -> a.doubleValue() - b.doubleValue()
    ),

    MULTIPLY(
            "*",
            (a, b) -> a.doubleValue() * b.doubleValue()
    ),

    DIVIDE(
            "/",
            (a, b) -> a.doubleValue() / b.doubleValue()
    );


    private String sign;
    private BiFunction<Long, Long, Double> operationFunction;

    Operation(String sign, BiFunction<Long, Long, Double> operationFunction) {
        this.sign = sign;
        this.operationFunction = operationFunction;
    }

    public static Operation getBySign(String sign) {
        return Arrays.stream(values())
                .filter(operation -> operation.getSign().equals(sign))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("There is no operation with the '%s' sign", sign)));
    }

    public String getSign() {
        return sign;
    }

    public BiFunction getOperationFunction() {
        return operationFunction;
    }

}
