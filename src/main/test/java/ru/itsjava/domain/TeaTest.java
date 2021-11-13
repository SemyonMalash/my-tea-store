package ru.itsjava.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Tea должен: ")
public class TeaTest {

    public static final String DEFAULT_BRAND = "Lipton";

    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void Constructor() {
        Tea tea = new Tea(DEFAULT_BRAND);
    }
}
