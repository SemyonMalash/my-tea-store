package ru.itsjava.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("Класс Client должен: ")
public class ClientTest {

    public static final String DEFAULT_NAME = "Ваня";
    public static List<Tea> teaList;

    @DisplayName("Корректно создаваться коструктором")
    @Test
    public void Constructor() {
        Client client = new Client(DEFAULT_NAME, teaList);
    }
}
