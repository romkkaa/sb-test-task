package com.github.romkkaa.util;

import com.github.romkkaa.domain.ArithmeticExpression;

public class ArithmeticExpressionCalculator {

    public static Double calculate(ArithmeticExpression expression) {
        return expression
                .getOperation()
                .getOperationFunction()
                .apply(expression.getFirstNumber(), expression.getSecondNumber());
    }

}
