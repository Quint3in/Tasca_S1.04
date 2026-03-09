package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void shouldAssertSameReference() {
        Object a = new Object();
        Object b = a;
        assertThat(a).isSameAs(b);
    }

    @Test
    void shouldAssertDifferentReference() {
        Object a = new Object();
        Object b = new Object();
        assertThat(a).isNotSameAs(b);
    }
}
