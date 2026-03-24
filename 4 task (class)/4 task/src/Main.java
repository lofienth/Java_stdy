//Постановка задачи:
//        Создать программу на языке Java для определения класса в некоторой
//        предметной области. Описать свойства, конструктор, методы геттеры/сеттеры,
//        перекрыть метод toString() для вывода полной информации об объекте в отформатированном виде:
//
//        к - Конструктор
//
//        2). Система управления доставкой товара.
//        Order - заявка:
//        Свойства:
//        Id – идентификатор;
//        name – название товара;
//        courier – курьер (ответственный за доставку);
//        dateTime – дата и время (String);
//        type – тип заказа (1 – срочный заказ; 2 – обычный заказ).

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //создание объекта класса Order
        Order order1 = new Order(101, "Ноутбук", "Иван Петров", LocalDateTime.of(2026, 3, 23, 14, 30), 1);

        //вывод полной информации через toString()
        System.out.println(order1);

        System.out.println();

        //второй объект
        Order order2 = new Order(102, "Смартфон", "Алексей Смирнов", LocalDateTime.of(2026,3,14,10,15), 2);

        //вывод второго объекта
        System.out.println(order2);

        System.out.println();

        //использование геттера
        System.out.println("Название товара во второй заявке: " + order2.getName());

        System.out.println();

        //использование сеттера
        order2.setCourier("Дмитрий Волков");
        System.out.println("После изменения курьера: ");
        System.out.println(order2);

    }
}