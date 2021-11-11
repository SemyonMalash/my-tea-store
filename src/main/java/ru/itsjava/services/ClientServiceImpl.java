package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Tea;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final TeaService teaService;

    @Override
    public void buyTea() {
        System.out.println("Введите название чая");
        String brand = scanner.next();
        if (teaService.haveTea(brand)) {
            System.out.println("Покупаем чай ...");
            teaService.takeTeaByBrand(brand);
            System.out.println("Купили чай");
        } else {
            System.out.println("Такого чая нет");
        }
    }

    @Override
    public void putTea() {
        System.out.println("Введите название чая");
        String brand = scanner.next();

        Tea tea = new Tea(brand);
        teaService.putTea(tea);
    }

    @Override
    public void printTea() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Наш чай: ");
        teaService.printTea();
    }
}
