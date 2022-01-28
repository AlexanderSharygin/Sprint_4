package ru.praktikum.string_cheker;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        return ((name.length() > 3 && name.length() < 19 && name.matches("(^[A-zА-яЁё])([A-zА-яЁё]+ {1})([A-zА-яЁё]*$)")));
    }

}
