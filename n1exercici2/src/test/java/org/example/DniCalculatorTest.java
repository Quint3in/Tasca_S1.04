package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

public class DniCalculatorTest  {
    private final DniCalculator calculator = new DniCalculator();


    @ParameterizedTest
    @CsvSource({
            "10000000,Z",
            "12345678,Z",
            "23456789,D",
            "34567890,V",
            "45678901,G",
            "56789012,B",
            "67890123,B",
            "78901234,X",
            "87654321,X",
            "99999999,R"
    })
    void shouldReturnCorrectLetterForValid8DigitDniNumbers(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, calculator.getDniLetter(dniNumber));
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "-99999999",
            "0",
            "9999999",
            "100000000",
            "2147483647",
    })
    void shouldThrowForInvalidDniNumber(int dniNumber) {
        assertThrows(IllegalArgumentException.class, () -> calculator.getDniLetter(dniNumber));
    }
}
