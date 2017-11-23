package com.github.romkkaa;

import com.github.romkkaa.domain.ArithmeticStatement;
import com.github.romkkaa.util.ArithmeticStatementCalculator;
import com.github.romkkaa.util.TestDataFileReader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.io.File;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArithmeticTest {

    private static final Double ACCURACY = 0.01;

    @Parameter
    public String firstNumber;
    @Parameter(1)
    public String secondNumber;
    @Parameter(2)
    public String operator;
    @Parameter(3)
    public String result;

    @Parameters
    public static Collection<Object[]> data() {
        return TestDataFileReader.readTestDataFromFile(new File("src/test/resources/test_data.txt"));
    }

    @Test
    public void testArithmeticResults() {
        ArithmeticStatement statement = new ArithmeticStatement(firstNumber, secondNumber, operator, result);
        Assert.assertEquals(ArithmeticStatementCalculator.calculate(statement), Double.parseDouble(result), ACCURACY);
    }
}
