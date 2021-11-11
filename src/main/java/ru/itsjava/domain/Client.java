package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Client {
    private final String name;
    private final List<Tea> tea;
}
