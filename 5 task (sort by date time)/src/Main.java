//Постановка задачи:
//        Вариант 2). Система управления доставкой товара. Реализовать сортировку по дате и по времени.

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //создание списка для заказов
        List<Order> orders = new ArrayList<>();

        //добавление заказов
        orders.add(new Order(101, "Ноутбук", "Иван Петров",
                LocalDateTime.of(2026, 3, 23, 14, 30), 1));

        orders.add(new Order(102, "Смартфон", "Алексей Смирнов",
                LocalDateTime.of(2026, 3, 21, 9, 15), 2));

        orders.add(new Order(103, "Планшет", "Дмитрий Волков",
                LocalDateTime.of(2026, 3, 23, 8, 45), 1));

        orders.add(new Order(104, "Монитор", "Олег Иванов",
                LocalDateTime.of(2026, 3, 22, 16, 20), 2));

        //исходный список
        System.out.println("=== Исходный список ===");
        printList(orders);

        //сортировка по возрастанию
        orders.sort(Comparator.comparing(Order::getDateTime));

        System.out.println("=== По возрастанию даты ===");
        printList(orders);

        //сортировка по убыванию
        orders.sort(Comparator.comparing(Order::getDateTime).reversed());//reversed() - поворачивает сортировку, делая её в обратном направлении

        System.out.println("=== По убыванию даты ===");
        printList(orders);

        //сортировка только по дате
        orders.sort(Comparator.comparing(order -> order.getDateTime().toLocalDate()));

        System.out.println("=== Только по дате ===");
        printList(orders);

        //сортировка только по времени
        orders.sort(Comparator.comparing(order -> order.getDateTime().toLocalTime()));

        System.out.println("=== Только по времени ===");
        printList(orders);
    }

    //метод для вывода списка
    public static void printList(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
            System.out.println();
        }
    }
}
