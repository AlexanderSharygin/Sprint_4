package ru.praktikum.string_cheker;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Account test1 = new Account("Саша Сашин");
        boolean res  = test1.checkNameToEmboss();

         test1 = new Account("Саша Саша Саша");
       res  = test1.checkNameToEmboss();
        test1 = new Account(" Саша Сашаин");
        res  = test1.checkNameToEmboss();
        test1 = new Account("Саша Сашаин ");
        res  = test1.checkNameToEmboss();
        test1 = new Account(" Саша Сашаин ");
        res  = test1.checkNameToEmboss();
        test1 = new Account("СашаСашаин");
        res  = test1.checkNameToEmboss();
        test1 = new Account("Саша Сашаин");
        res  = test1.checkNameToEmboss();
    }

}
