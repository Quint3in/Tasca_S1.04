package org.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    void shouldBeEmptyWhenOptionalHasNoValue() {
        Optional<String> o = Optional.empty();

        assertThat(o).isEmpty();
    }
}
