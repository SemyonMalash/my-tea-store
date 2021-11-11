package ru.itsjava.services;

import ru.itsjava.domain.Tea;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Tea> teaList = new ArrayList<>();
        teaList.add(new Tea("Greenfield"));
        teaList.add(new Tea("Lipton"));

        TeaService teaService = new TeaServiceImpl(teaList);

        ClientService clientService =
                new ClientServiceImpl(client, scanner, teaService);


        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();

    }
}
