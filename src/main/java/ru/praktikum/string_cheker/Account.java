package ru.praktikum.string_cheker;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        return (name.length()<20 && name.matches("(^[A-zА-яЁё]+)( )([A-zА-яЁё]+$)"));
    }

}
