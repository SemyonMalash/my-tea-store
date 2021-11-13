package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Tea;

import java.util.List;

@RequiredArgsConstructor
public class TeaServiceImpl implements TeaService {
    private final List<Tea> teaFromStore;

    @Override
    public Tea takeTeaByBrand(String brand) {
        Tea resTea = null;
        for (Tea tea : teaFromStore) {
            if (tea.getBrand().equals(brand)) {
                resTea = tea;
            }
        }

        if (resTea != null) {
            teaFromStore.remove(resTea);
            return resTea;
        }
        return null;
    }

    @Override
    public void putTea(Tea tea) {
        teaFromStore.add(tea);
    }

    @Override
    public boolean haveTea(String name) {
        for (Tea tea : teaFromStore) {
            if (tea.getBrand().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printTea() {
        for (Tea tea : teaFromStore) {
            System.out.println(tea.getBrand());
        }
    }
}
