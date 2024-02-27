package ru.geekbrains.core.lesson1.task4;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждй сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру+
 * Добавить метод добавление нового сотрудника в справочник+
 */
public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addWorker("Ivan", "+7899999", 2);
        catalog.addWorker("Irina", "+7855526269", 10);
        catalog.addWorker( "Slava", "+789111119", 1);
        catalog.addWorker( "Slava", "+78912341119", 1);
        catalog.addWorker("Sasha", "+78342629", 2);
        catalog.addWorker("Helga", "+78555", 5);
        catalog.addWorker("Semen", "+76665252", 4);
        System.out.println(catalog);

        System.out.println(catalog.findWorkerBySeniority(2));
        System.out.println(catalog.findPhoneByName("Irina"));
        System.out.println(catalog.findPhoneByName("Slava"));
        System.out.println(catalog.findWorkerByPersonalId(3));


    }
}