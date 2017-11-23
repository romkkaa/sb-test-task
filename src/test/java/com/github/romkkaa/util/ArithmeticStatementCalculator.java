package com.github.romkkaa.util;

import com.github.romkkaa.domain.ArithmeticStatement;

public class ArithmeticStatementCalculator {

    public static Double calculate(ArithmeticStatement statement) {
        return statement
                .getOperation()
                .getOperationFunction()
                .apply(statement.getFirstNumber(), statement.getSecondNumber());
    }

}
