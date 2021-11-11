package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {

        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.println("Вы выбрали купить чай");
                clientService.buyTea();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали вернуть чай");
                clientService.putTea();
            } else if (menuNum == 3) {
                System.out.println("Печатаем названия чая...");
                clientService.printTea();
            } else {
                System.out.println("До встречи");
                break;
            }
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1 - Купить, 2 - Вернуть, 3 - Напечатать названия, Всё остальное - выход");
    }
}
