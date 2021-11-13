package ru.itsjava.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Tea;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Класс Tea должен: ")
public class TeaServiceTest {

    public static final String DEFAULT_BRAND = "Lipton";
    public static List<Tea> teaList;

    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void constructor() {

        TeaServiceImpl teaServiceImpl = new TeaServiceImpl(teaList);
    }

    @DisplayName("Корректно брать чай из магазина")
    @Test
    public void takeTeaByBrand() {

        List<Tea> teaList = new ArrayList<>();
        teaList.add(new Tea("Lipton"));

        TeaService teaService = new TeaServiceImpl(teaList);

        teaService.takeTeaByBrand(DEFAULT_BRAND);

        teaList.isEmpty();
    }
}
