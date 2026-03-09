package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void shouldValidateArrayListContentRules() {
        List<Object> a = new ArrayList<>();
        String hello = "hello";
        Integer number = 1;
        Integer number2 = 2;
        double[] doubles = new double[] { 1.5, 2.5, 3.5 };
        a.add(number);
        a.add(hello);
        a.add(doubles);
        a.add(doubles);

        assertThat(a).containsExactlyInAnyOrder(doubles, number, hello, doubles);
        assertThat(a).containsOnlyOnce(hello);
        assertThat(a).doesNotContain(number2);
    }
}
