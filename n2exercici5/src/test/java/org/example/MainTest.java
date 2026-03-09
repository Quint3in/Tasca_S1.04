package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void shouldAssertMapContainsExpectedKey() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        assertThat(map).containsKey(1);
    }
}
