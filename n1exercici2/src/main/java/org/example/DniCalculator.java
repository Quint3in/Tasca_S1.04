package org.example;

public class DniCalculator {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char getDniLetter(int dniNumber) {
        if (dniNumber < 10_000_000 || dniNumber > 99_999_999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99,999,999");
        }
        return LETTERS.charAt(dniNumber % 23);
    }
}
