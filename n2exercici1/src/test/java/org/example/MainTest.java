package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void shouldAssertEqualObjects() {
        Integer a = 1;
        Integer b = 1;
        assertThat(a).isEqualTo(b);
    }

    @Test
    void shouldAssertDifferentObjects() {
        Integer a = 1;
        Integer b = 2;
        assertThat(a).isNotEqualTo(b);
    }
}
