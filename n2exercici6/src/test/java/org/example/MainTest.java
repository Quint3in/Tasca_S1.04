package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {
    Car car = new Car();

    @Test
    void shouldThrowIndexOutOfBoundsExceptionWhenDeletingBackSeats() {
        assertThatThrownBy(()->{car.deleteBackSeats();})
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
}
