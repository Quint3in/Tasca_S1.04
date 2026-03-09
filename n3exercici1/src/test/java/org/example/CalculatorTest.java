package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    @Test
    public void calculatorGetTotalMethod() {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    public void calculatorShouldStartWithTotalZero(){
        Calculator calculator = new Calculator();

        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    public void calculatorAddMethod() {
        Calculator calculator = new Calculator();
        int n1 = 10;
        calculator.sum(n1);
        assertThat(calculator.getTotal()).isEqualTo(n1);
    }
    @Test
    public void calculatorSubMethod() {
        Calculator calculator = new Calculator();
        int n1 = 10;
        calculator.sub(n1);
        assertThat(calculator.getTotal()).isEqualTo(-n1);
    }
    @Test
    public void calculatorMultiMethod() {
        Calculator calculator = new Calculator();
        int n1 = 10;
        calculator.mul(n1);
        assertThat(calculator.getTotal()).isEqualTo(0);
    }
    @Test
    public void calculatorDivMethod() {
        Calculator calculator = new Calculator();
        calculator.sum(10);
        int n1 = 2;
        calculator.div(n1);
        assertThat(calculator.getTotal()).isEqualTo(5);
    }
    @Test
    public void calculatorDivMethodThrowsException(){
        Calculator calculator = new Calculator();
        int n1 = 0;
        assertThatThrownBy(() -> calculator.div(n1))
                .isInstanceOf(ArithmeticException.class);
    }
    @Test
    public void calculatorResetMethod() {
        Calculator calculator = new Calculator();
        calculator.sum(10);
        calculator.reset();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }
}
