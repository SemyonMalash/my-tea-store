package ru.itsjava.services;

import ru.itsjava.domain.Tea;

public interface TeaService {
    Tea takeTeaByBrand(String brand);

    void putTea(Tea tea);

    boolean haveTea(String name);

    void printTea();
}
