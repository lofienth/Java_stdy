import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //создаем объект Scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        //ввод значения a
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        //ввод значения b
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        //вычисление max(a, b+2)
        double maxValue = Math.max(a, b + 2);

        //вычисление min(1-a, b)
        double minValue = Math.min(1 - a, b);

        //проверка деления на 0
        if (minValue == 0) {
            System.out.println("Ошибка: деление на ноль (min(1-a, b) = 0)");
            return;
        }

        //вычисление числителя
        double numerator = 5 * maxValue - 4 * minValue;

        //вычисление знаменателя
        double denominator = 3 + (maxValue / minValue);

        // Проверка деления на 0 (знаменатель)
        if (denominator == 0) {
            System.out.println("Ошибка: знаменатель равен нулю");
            return;
        }

        //вычисление d
        double d = numerator / denominator;

        //вывод результата с форматом вывода до тысячной доли
        System.out.printf("Результат d = %.3f%n", d);

        scanner.close();
    }
}