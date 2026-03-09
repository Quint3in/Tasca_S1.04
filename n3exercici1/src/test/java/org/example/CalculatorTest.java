package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void calculatorShouldStartWithTotalZero(){
        Calculator calculator = new Calculator();

        assertThat(calculator.getTotal()).isEqualTo(0);
    }
}
